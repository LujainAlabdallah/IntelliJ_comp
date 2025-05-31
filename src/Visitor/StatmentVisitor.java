package Visitor;

import AST.*;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import symboltable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class StatmentVisitor extends AngularParserBaseVisitor<Statement> {
    private SymbolTable symbolTable;

    public StatmentVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
    @Override
    public Statement visitFUNCTIONCALL2(AngularParser.FUNCTIONCALL2Context ctx) {
        return visitFunctionCall(ctx.functionCall());
    }

    @Override
    public Statement visitMETHODCALL2(AngularParser.METHODCALL2Context ctx) {
        return visitMethodCall(ctx.methodCall());
    }

    @Override
    public Statement visitMethodCall(AngularParser.MethodCallContext ctx) {
        String objectName = "this"; // بما أن البداية THIS_KEYWORD
        String methodName = "";
        List<ExpressionSt> arguments = new ArrayList<>();
        List<ANYTYPE2> anytypes = new ArrayList<>();

        // نميز بين النوعين باستخدام وجود LEFT_PAREN (أي استدعاء دالة)
        if (ctx.LEFT_PAREN() != null) {
            // النوع الأول: استدعاء دالة
            List<TerminalNode> identifiers = ctx.IDENTIFIER();
            if (identifiers.size() >= 1) {
                // كل ما قبل الأخير هو objectName (إذا وُجد أكثر من واحد)
                objectName = identifiers.get(0).getText();
                if (identifiers.size() >= 2) {
                    methodName = identifiers.get(identifiers.size() - 1).getText();
                }
            }
            symbolTable.add(methodName, "method_call");
            // زيارة الـ arguments
            if (ctx.arguments() != null) {
                for (AngularParser.ExpressionContext exprCtx : ctx.arguments().expression()) {
                    ExpressionSt expr = (ExpressionSt) visitExpression(exprCtx);
                    arguments.add(expr);
                }
            }

        } else {
            // النوع الثاني: عملية إسناد
            if (!ctx.IDENTIFIER().isEmpty()) {
                objectName = ctx.IDENTIFIER(0).getText();
                symbolTable.add(objectName, "object_assignment");
            }

            // زيارة any_type*
            for (AngularParser.Any_typeContext anyCtx : ctx.any_type()) {
                ANYTYPE2 type = (ANYTYPE2) visitAny_type(anyCtx);
                anytypes.add(type);
            }
        }

        return new MethodCall2(objectName, methodName, arguments, anytypes);
    }

    @Override
    public Statement visitASSIGMENT2(AngularParser.ASSIGMENT2Context ctx) {
        return visitAssignment(ctx.assignment());
    }

    @Override
    public Statement visitAssignment(AngularParser.AssignmentContext ctx) {
        List<String> target = new ArrayList<>();
        AST.ExpressionSt value = null;
        List<ANYTYPE2> anytypes = new ArrayList<>();

        // استخراج أسماء المتغيرات في الطرف الأيسر (IDENTIFIER*)
        for (TerminalNode id : ctx.IDENTIFIER()) {
            target.add(id.getText());
            symbolTable.add(id.getText(), "variable");
        }

        // التحقق إذا كانت القيمة من نوع expression أو any_type
        if (ctx.expression() != null) {
            value = (ExpressionSt) visitExpression(ctx.expression());
        }

        if (ctx.any_type() != null && !ctx.any_type().isEmpty()) {
            for (int i = 0; i < ctx.any_type().size(); i++) {
                anytypes.add((ANYTYPE2) visit(ctx.any_type().get(i)));
            }
        }

        return new ASSIGMENT2(target, value, anytypes);
    }


    @Override
    public Statement visitVIF3(AngularParser.VIF3Context ctx) {
        return visitVif(ctx.vif());
    }

    @Override
    public Statement visitVif(AngularParser.VifContext ctx) {
        ExpressionSt condition = (ExpressionSt) visitExpression(ctx.expression());
        StatmentVisitor statmentVisitor = new StatmentVisitor(symbolTable);

        // if-body
        List<AST.Statement> ifBody = new ArrayList<>();
        for (int i = 0 ; i < ctx.statement().size();i++) {
            ifBody.add(statmentVisitor.visit(ctx.statement().get(i)));
        }

        // else-body (اختياري)
        List<AST.Statement> elseBody = new ArrayList<>();
        if (ctx.ELSE_CONDITION() != null && ctx.statement().size() > 1) {
            for (int i = 0 ; i < ctx.statement().size();i++) {
                elseBody.add(statmentVisitor.visit(ctx.statement().get(i)));
            }
        }

        return new VIF3(condition, ifBody, elseBody);
    }

    @Override
    public Statement visitLOOPSTATEMENT3(AngularParser.LOOPSTATEMENT3Context ctx) {
        return visitLoopStatement(ctx.loopStatement());
    }

    @Override
    public Statement visitLoopStatement(AngularParser.LoopStatementContext ctx) {
        ASSIGMENT2 init = (ASSIGMENT2) visitAssignment(ctx.assignment(0));
        ExpressionSt condition = (ExpressionSt) visitExpression(ctx.expression());
        ASSIGMENT2 update = (ASSIGMENT2) visitAssignment(ctx.assignment(1));

        List<Statement> body = new ArrayList<>();
        StatmentVisitor statmentVisitor = new StatmentVisitor(symbolTable);
        for (int i = 0; i < ctx.statement().size(); i++) {
            Statement stmt = statmentVisitor.visit(ctx.statement().get(i));
            body.add(stmt);
        }

        return new LOOPSTATEMENT3(init, condition, update, body);
    }

    @Override
    public Statement visitRETURNSTATEMENT2(AngularParser.RETURNSTATEMENT2Context ctx) {
        return   visitReturnStatement(ctx.returnStatement());
    }

    @Override
    public Statement visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        ExpressionSt expression = (ExpressionSt) visitExpression(ctx.expression());
        return new RETURNSTATEMENT2(expression);
    }

    @Override
    public Statement visitExpression(AngularParser.ExpressionContext ctx) {
        if (!ctx.IDENTIFIER().isEmpty()) {
            for (TerminalNode id : ctx.IDENTIFIER()) {
                symbolTable.add(id.getText(), "expression_var");
            }
        }

        if (ctx.STRING() != null) {
            symbolTable.add(ctx.STRING().getText(), "string_literal", ctx.STRING().getText());
            return new ExpressionSt(ctx.STRING().getText(), true);
        }

        if (ctx.BOOLEAN() != null) {
            symbolTable.add(ctx.BOOLEAN().getText(), "boolean_literal", ctx.BOOLEAN().getText());
            return new ExpressionSt(Boolean.parseBoolean(ctx.BOOLEAN().getText()));
        }

        if (ctx.NULL() != null) {
            symbolTable.add("null", "null_literal");
            return new ExpressionSt("null", false);
        }

        if (ctx.NULLCOALESCE() != null && ctx.STRING() != null) {
            List<String> ids = ctx.IDENTIFIER().stream().map(TerminalNode::getText).toList();
            boolean notPeriod = ctx.LOGICAL_NOT_PERIOD() != null;
            return new ExpressionSt(ExpressionSt.ExpressionType.IDENTIFIER_CHAIN, ids, notPeriod, ctx.STRING().getText(), null);
        }

        if (ctx.NULLCOALESCE() != null && ctx.expression() != null) {
            List<String> ids = ctx.IDENTIFIER().stream().map(TerminalNode::getText).toList();
            boolean hasNot = ctx.LOGICAL_NOT() != null;
            ExpressionSt expr = (ExpressionSt) visitExpression(ctx.expression());
            return new ExpressionSt(ExpressionSt.ExpressionType.PROPERTY_ACCESS_CHAIN, ids, hasNot, null, expr);
        }

        if (ctx.term() != null && ctx.children.size() == 1) {
            Term term = (Term) visitTerm(ctx.term(0));
            return new ExpressionSt(term);
        }

        if (ctx.term().size() > 1) {
            Term first = (Term) visitTerm(ctx.term(0));
            List<String> ops = ctx.children.stream().filter(c -> c.getText().equals("+") || c.getText().equals("-")).map(c -> c.getText()).toList();
            List<Term> others = ctx.term().subList(1, ctx.term().size()).stream().map(t -> (Term) visitTerm(t)).toList();
            return new ExpressionSt(first, ops, others);
        }


        if (ctx.STRING() != null) {
            return new ExpressionSt(ctx.STRING().getText(), true);
        }

        if (ctx.BOOLEAN() != null) {
            return new ExpressionSt(Boolean.parseBoolean(ctx.BOOLEAN().getText()));
        }

        if (ctx.NULL() != null) {
            return new ExpressionSt("null", false);
        }

        if (ctx.NULLCOALESCE() != null && ctx.STRING() != null) {
            List<String> ids = ctx.IDENTIFIER().stream()
                    .map(TerminalNode::getText)
                    .toList();
            boolean notPeriod = ctx.LOGICAL_NOT_PERIOD() != null;
            return new ExpressionSt(ExpressionSt.ExpressionType.IDENTIFIER_CHAIN, ids, notPeriod, ctx.STRING().getText(), null);
        }

        if (ctx.NULLCOALESCE() != null && ctx.expression() != null) {
            List<String> ids = ctx.IDENTIFIER().stream()
                    .map(TerminalNode::getText)
                    .toList();
            boolean hasNot = ctx.LOGICAL_NOT() != null;
            ExpressionSt expr = (ExpressionSt) visitExpression(ctx.expression());
            return new ExpressionSt(ExpressionSt.ExpressionType.PROPERTY_ACCESS_CHAIN, ids, hasNot, null, expr);
        }
        if (ctx.term() != null && ctx.children.size() == 1) {
            Term term = (Term) visitTerm(ctx.term(0));
            return new ExpressionSt(term);
        }

        if (ctx.term().size() > 1) {
            Term first = (Term) visitTerm(ctx.term(0));
            List<String> ops = ctx.children.stream()
                    .filter(c -> c.getText().equals("+") || c.getText().equals("-"))
                    .map(c -> c.getText())
                    .toList();
            List<Term> others = ctx.term().subList(1, ctx.term().size())
                    .stream()
                    .map(t -> (Term) visitTerm(t))
                    .toList();
            return new ExpressionSt(first, ops, others);
        }



        return null;
    }

    @Override
    public Statement visitTerm(AngularParser.TermContext ctx) {
        FactorVisitor factorVisitor = new FactorVisitor(symbolTable);
        Factor left = (Factor) factorVisitor.visit(ctx.factor(0));

        List<String> operators = ctx.children.stream()
                .filter(c -> c.getText().equals("*") || c.getText().equals("/"))
                .map(c -> c.getText())
                .toList();

        List<Factor> rights = ctx.factor().subList(1, ctx.factor().size()).stream()
                .map(f -> (Factor) factorVisitor.visit(f))
                .toList();

        return new Term(left, operators, rights);
    }

    @Override
    public Statement visitANYTYPE2(AngularParser.ANYTYPE2Context ctx) {
        return visitAny_type(ctx.any_type());
    }
    @Override
    public Statement visitAny_type(AngularParser.Any_typeContext ctx) {
        if (ctx.LENGTH() != null) {
            symbolTable.add(ctx.LENGTH().getText(), "length");
            return new ANYTYPE2(AnyType.Type.LENGTH, ctx.getText());
        } else if (ctx.COLOR() != null) {
            symbolTable.add(ctx.COLOR().getText(), "color");
            return new ANYTYPE2(AnyType.Type.COLOR, ctx.getText());
        } else if (ctx.IDENTIFIER() != null) {
            symbolTable.add(ctx.IDENTIFIER().getText(), "identifier");
            return new ANYTYPE2(AnyType.Type.IDENTIFIER, ctx.getText());
        } else if (ctx.NUMBER() != null) {
            symbolTable.add(ctx.NUMBER().getText(), "number");
            return new ANYTYPE2(AnyType.Type.NUMBER, ctx.getText());
        } else if (ctx.STRING() != null) {
            symbolTable.add(ctx.STRING().getText(), "string_literal");
            return new ANYTYPE2(AnyType.Type.STRING, ctx.getText());
        } else if (ctx.ANY() != null) {
            symbolTable.add(ctx.ANY().getText(), "any");
            return new ANYTYPE2(AnyType.Type.ANY, ctx.getText());
        } else if (ctx.product() != null || ctx.LEFT_BRACKET() != null) {
            List<Product> products = new ArrayList<>();
            for (AngularParser.ProductContext productCtx : ctx.product()) {
                Product p = (Product) visitProduct(productCtx);
                products.add(p);
            }
            return new ANYTYPE2(AnyType.Type.ARRAY, products);
        }
        return null;
    }
    @Override
    public Statement visitPRINT2(AngularParser.PRINT2Context ctx) {

        return visit(ctx.print());
    }
    @Override
    public Statement visitPrint(AngularParser.PrintContext ctx) {
        String name = ctx.STRING().getText();
        symbolTable.add(name, "print_string", name);
        return new PRINT2(name);
    }
}
