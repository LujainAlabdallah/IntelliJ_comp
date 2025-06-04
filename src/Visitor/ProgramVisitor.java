package Visitor;

import AST.*;
import AST.Class;
import SemanticError.ReservedWords;
import SemanticError.SemanticErrorReporter;
import SemanticError.UndefinedVariableChecker;
import SemanticError.ValueConflictChecker;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import symboltable.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ProgramVisitor extends AngularParserBaseVisitor<ProgramAll> {
    private SymbolTable symbolTable = new SymbolTable();
    private SemanticErrorReporter reporter;

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public ProgramAll visitService(AngularParser.ServiceContext ctx) {
        List<String> identifiers = ctx.IDENTIFIER().stream()
                .map(id -> id.getText())
                .collect(Collectors.toList());
        String name = ctx.STRING().getText();
        symbolTable.add(String.valueOf(identifiers),"service",name);
        return new service(identifiers, name);
    }

    @Override
    public ProgramAll visitSERVICE1(AngularParser.SERVICE1Context ctx) {
        return visit(ctx.service());
    }

    @Override
    public ProgramAll visitIMPORTSTATEMENT1(AngularParser.IMPORTSTATEMENT1Context ctx) {
        return visit(ctx.importStatements());
    }

    @Override
    public ProgramAll visitImportStatements(AngularParser.ImportStatementsContext ctx) {
        String module = ctx.STRING().getText();
       //symbolTable.add(module,"ImportStatements");
        return new ImportStatement(module);
    }

    @Override
    public ProgramAll visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
        componentDeclaration componentDeclaration = new componentDeclaration();
        MetadataVisitor metadataVisitor = new MetadataVisitor(symbolTable);
        List<ComponentMetadata> componentMetadataList = new ArrayList<>();

        for (AngularParser.Component_metadataContext metaCtx : ctx.component_metadata()) {
            ComponentMetadata metadata = metadataVisitor.visit(metaCtx);
            // System.out.println(metadata.toString());

            componentMetadataList.add(metadata);
        }

        componentDeclaration.setComponentMetadata(componentMetadataList); // أو استخدم addMeta()

        return componentDeclaration;
    }

    @Override
    public ProgramAll visitCOMPONENTDECLARATION1(AngularParser.COMPONENTDECLARATION1Context ctx) {
        return visit(ctx.componentDeclaration());
    }

    @Override
    public ProgramAll visitCLASS1(AngularParser.CLASS1Context ctx) {
        return visit(ctx.class_());
    }

    @Override
    public ProgramAll visitClass(AngularParser.ClassContext ctx) {
        List<classMember> classMembers = new ArrayList<>();
        ClassMemberVisitor classMemberVisitor = new ClassMemberVisitor(symbolTable);
        Class cl = new Class();

        List<String> identifiers = ctx.IDENTIFIER().stream()
                .map(TerminalNode::getText)
                .collect(Collectors.toList());

        String className = identifiers.get(0);
        symbolTable.add(className, "class");

        for (AngularParser.ClassMemberContext classMemberContext : ctx.classMember()) {
            classMember classMember = classMemberVisitor.visit(classMemberContext);
            classMembers.add(classMember);
        }

        cl.setClassMemberList(classMembers);

        return new AST.Class(identifiers, classMembers);
    }


    @Override
    public ProgramAll visitConstructor(AngularParser.ConstructorContext ctx) {
        Constructor constructor = new Constructor();
        symbolTable.add("constructor", "constructor");
        // المعطيات
        if (ctx.IDENTIFIER() != null) {
            List<String> params = new ArrayList<>();
            for (TerminalNode id : ctx.IDENTIFIER()) {
                params.add(id.getText());
                symbolTable.add("constructor", String.valueOf(params), "parameter");
            }
            constructor.setParameters(params);
        } else {
            constructor.setParameters(new ArrayList<>());
        }

        // استدعاءات الدوال داخل البلوك
        constructor.methodCall2s = new ArrayList<>();
        for (AngularParser.MethodCallContext mcCtx : ctx.methodCall()) {
            methodcall methodCall = (methodcall) visitMethodCall(mcCtx); // تأكد أن لديك visitMethodCall2
            constructor.addmethodcalls(methodCall);
            symbolTable.add("constructor","constructor", String.valueOf(methodCall));
        }

        return constructor;
    }

    @Override
    public ProgramAll visitCONSTRUCTOR1(AngularParser.CONSTRUCTOR1Context ctx) {
        return visit(ctx.constructor());
    }

    @Override
    public ProgramAll visitPRINT1(AngularParser.PRINT1Context ctx) {
        return visit(ctx.print());
    }

    @Override
    public ProgramAll visitPrint(AngularParser.PrintContext ctx) {
        if (ctx.STRING() != null) {
            symbolTable.add(ctx.STRING().getText(), "print_string", ctx.STRING().getText());
        }
        return super.visitPrint(ctx);
    }

    @Override
    public ProgramAll visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        Expression expression = (Expression) visitExpression(ctx.expression());
        symbolTable.add("return",expression.toString());
        return new returnStatement(expression);


    }

    @Override
    public ProgramAll visitRETURNSTATEMENT1(AngularParser.RETURNSTATEMENT1Context ctx) {
        return visit(ctx.returnStatement());
    }

    @Override
    public ProgramAll visitMETHODCALL1(AngularParser.METHODCALL1Context ctx) {
        return visit(ctx.methodCall());
    }

    @Override
    public ProgramAll visitMethodCall(AngularParser.MethodCallContext ctx) {
        String objectName = "this";
        String methodName = "";
        List<Expression> arguments = new ArrayList<>();
        List<AnyType> anytypes = new ArrayList<>();
        if (!ctx.IDENTIFIER().isEmpty()) {
            String obj = ctx.IDENTIFIER(0).getText();
            symbolTable.add(obj, "object");
        }
        if (ctx.LEFT_PAREN() != null) {
            List<TerminalNode> identifiers = ctx.IDENTIFIER();
            if (identifiers.size() >= 1) {
                objectName = identifiers.get(0).getText();
                if (identifiers.size() >= 2) {
                    methodName = identifiers.get(identifiers.size() - 1).getText();
                }
            }

            if (ctx.arguments() != null) {
                for (AngularParser.ExpressionContext exprCtx : ctx.arguments().expression()) {
                    Expression expr = (Expression) visitExpression(exprCtx);
                    arguments.add(expr);
                }
            }

        } else {
            if (!ctx.IDENTIFIER().isEmpty()) {
                objectName = ctx.IDENTIFIER(0).getText();
            }

            for (AngularParser.Any_typeContext anyCtx : ctx.any_type()) {
                AnyType type = (AnyType) visitAny_type(anyCtx);
                anytypes.add(type);
            }
        }

        return new methodcall(objectName, methodName, arguments, anytypes);
    }

    @Override
    public ProgramAll visitASSIGMENT1(AngularParser.ASSIGMENT1Context ctx) {
        return visit(ctx.assignment());
    }

    @Override
    public ProgramAll visitAssignment(AngularParser.AssignmentContext ctx) {
        List<String> target = new ArrayList<>();
        AST.Expression value = null;
        List<AnyType> anytypes = new ArrayList<>();

        for (TerminalNode id : ctx.IDENTIFIER()) {
            String varName = id.getText();
            target.add(varName);
        }

        if (ctx.expression() != null) {
            value = (Expression) visit(ctx.expression());
        }

        if (ctx.any_type() != null && !ctx.any_type().isEmpty()) {
            for (int i = 0; i < ctx.any_type().size(); i++) {
                anytypes.add((AnyType) visit(ctx.any_type().get(i)));
            }
        }

        for (TerminalNode id : ctx.IDENTIFIER()) {
            String varName = id.getText();

            UndefinedVariableChecker undefinedVariableChecker = new UndefinedVariableChecker(symbolTable);
            ValueConflictChecker conflictChecker = new ValueConflictChecker(symbolTable);
            ReservedWords reservedWords = new ReservedWords();
            String newValue = String.valueOf(value != null ? value : anytypes);
            if (!reservedWords.isReserved(varName)) {
                if (!undefinedVariableChecker.check(varName)) {
                    if (!conflictChecker.check(varName, newValue)) {
                        symbolTable.add(varName, "variable", newValue);
                    }
                }
            }
        }

        return new assignment(target, value, anytypes);
    }



    @Override
    public ProgramAll visitLOOPSTATEMENT1(AngularParser.LOOPSTATEMENT1Context ctx) {
        return visit(ctx.loopStatement());
    }

    @Override
    public ProgramAll visitLoopStatement(AngularParser.LoopStatementContext ctx) {
        visit(ctx.assignment(0)); // init
        visit(ctx.expression());   // condition
        visit(ctx.assignment(1)); // update

        for (int i = 0; i < ctx.statement().size(); i++) {
            visit(ctx.statement(i));
        }
        return null;
    }

    @Override
    public ProgramAll visitFUNCTIONCALL1(AngularParser.FUNCTIONCALL1Context ctx) {
        return visit(ctx.functionCall());
    }

    @Override
    public ProgramAll visitFunctionCall(AngularParser.FunctionCallContext ctx) {
        String functionName = null;
        List<AST.Expression> args = new ArrayList<>();
        AnyType anytype = null;
        if (!ctx.IDENTIFIER().isEmpty()) {
            String functionCallName = ctx.IDENTIFIER(0).getText();
            symbolTable.add(functionCallName, "function_call");
        }

        if (ctx.arguments() != null) {
            if (!ctx.IDENTIFIER().isEmpty()) {
                functionName = ctx.IDENTIFIER().stream()
                        .map(TerminalNode::getText)
                        .collect(Collectors.joining("."));
            }

            if (ctx.arguments() != null) {
                for (AngularParser.ExpressionContext exprCtx : ctx.arguments().expression()) {
                    Expression expr = (Expression) visitExpression(exprCtx);
                    args.add(expr);
                }
            }

            if (ctx.any_type() != null) {
                anytype = (AnyType) visitAny_type(ctx.any_type());
            }
        }
        return new functionCall(functionName, args, anytype);
    }

    @Override
    public ProgramAll visitMETHOD1(AngularParser.METHOD1Context ctx) {
        return visit(ctx.method());
    }

    @Override
    public ProgramAll visitMethod(AngularParser.MethodContext ctx) {
        List<String> nameParts = ctx.IDENTIFIER().stream()
                .map(TerminalNode::getText)
                .collect(Collectors.toList());

        String methodName = nameParts.isEmpty() ? "anonymous" : nameParts.get(0);
        symbolTable.add(methodName, "method");

        StatmentVisitor statmentVisitor = new StatmentVisitor(symbolTable);
        List<Statement> statements = new ArrayList<>();

        for (int i = 0; i < ctx.statement().size(); i++) {
            Statement stmt = statmentVisitor.visit(ctx.statement(i));
            statements.add(stmt);
        }

        return new method(nameParts, statements);
    }

    @Override
    public ProgramAll visitAny_type(AngularParser.Any_typeContext ctx) {
        if (ctx.LENGTH() != null) {
            symbolTable.add("anyType.Length", String.valueOf(AnyType.Type.LENGTH),ctx.getText());
            return new AnyType(AnyType.Type.LENGTH, ctx.getText());
        } else if (ctx.COLOR() != null) {
            symbolTable.add("anyType.COLOR", String.valueOf(AnyType.Type.COLOR),ctx.getText());
            return new AnyType(AnyType.Type.COLOR, ctx.getText());
        } else if (!ctx.IDENTIFIER().isEmpty()) {
            ReservedWords reservedWords = new ReservedWords();

            String name = ctx.IDENTIFIER(0).getText();
            String value = (ctx.IDENTIFIER().size() > 1) ? ctx.IDENTIFIER(1).getText() : "anyType"; // النوع مثل BOOLEAN
if (!reservedWords.isReserved(name)){

            symbolTable.add(name, "Anytype", value);}
            return new AnyType(AnyType.Type.IDENTIFIER, name);
         //   symbolTable.add(ctx.IDENTIFIER().getText(),"anyType", String.valueOf(ctx.IDENTIFIER().getText()));
           // return new AnyType(AnyType.Type.IDENTIFIER, ctx.getText());
        } else if (ctx.NUMBER() != null) {
            symbolTable.add("anyType.NUMBER", String.valueOf(AnyType.Type.NUMBER), String.valueOf(AnyType.Type.NUMBER));
            return new AnyType(AnyType.Type.NUMBER, ctx.getText());
        } else if (ctx.STRING() != null) {
            symbolTable.add("anyType.STRING", String.valueOf(AnyType.Type.STRING),ctx.getText());
            return new AnyType(AnyType.Type.STRING, ctx.getText());
        } else if (ctx.ANY() != null) {
         //   symbolTable.add("anyType.ANY", String.valueOf(AnyType.Type.ANY),ctx.getText());
            return new AnyType(AnyType.Type.ANY, ctx.getText());
        } else if (ctx.product() != null || ctx.LEFT_BRACKET() != null) {
            List<Product> products = new ArrayList<>();
            for (AngularParser.ProductContext productCtx : ctx.product()) {
                Product p = (Product) visitProduct(productCtx);
                products.add(p);
            }
            return new AnyType(AnyType.Type.ARRAY, products);
        }
        return null;
    }

    @Override
    public ProgramAll visitAnyType1(AngularParser.AnyType1Context ctx) {
        return visit(ctx.any_type());
    }

    @Override
    public ProgramAll visitProduct(AngularParser.ProductContext ctx) {
        List<TerminalNode> identifiers = ctx.IDENTIFIER();
        List<TerminalNode> numbers = ctx.NUMBER();
        List<TerminalNode> strings = ctx.STRING();

        List<String> firstKey = new ArrayList<>();
        List<String> secondKey = new ArrayList<>();
        List<String> thirdKey = new ArrayList<>();

        int idSize = identifiers.size();
        if (idSize >= 3) {
            firstKey.add(identifiers.get(0).getText());
            secondKey.add(identifiers.get(1).getText());
            thirdKey.add(identifiers.get(2).getText());
        } else {
            int splitSize = idSize / 3;
            for (int i = 0; i < splitSize; i++) firstKey.add(identifiers.get(i).getText());
            for (int i = splitSize; i < 2 * splitSize; i++) secondKey.add(identifiers.get(i).getText());
            for (int i = 2 * splitSize; i < idSize; i++) thirdKey.add(identifiers.get(i).getText());
        }

        String firstValue = numbers.isEmpty() ? "" : numbers.get(0).getText();
        String secondValue = strings.size() >= 1 ? strings.get(0).getText().replaceAll("\"", "") : "";
        String thirdValue = strings.size() >= 2 ? strings.get(1).getText().replaceAll("\"", "") : "";

        for (TerminalNode id : ctx.IDENTIFIER()) {
            symbolTable.add(id.getText(), "product_field");
        }
        for (TerminalNode num : ctx.NUMBER()) {
            symbolTable.add(num.getText(), "number", num.getText());
        }

        return new AST.Product(firstKey, firstValue, secondKey, secondValue, thirdKey, thirdValue);
    }

    @Override
    public ProgramAll visitVif(AngularParser.VifContext ctx) {
        Expression condition = (Expression) visitExpression(ctx.expression());
        StatmentVisitor statmentVisitor = new StatmentVisitor(symbolTable);

        List<AST.Statement> ifBody = new ArrayList<>();
        for (int i = 0; i < ctx.statement().size(); i++) {
            ifBody.add(statmentVisitor.visit(ctx.statement().get(i)));
        }

        List<AST.Statement> elseBody = new ArrayList<>();
        if (ctx.ELSE_CONDITION() != null && ctx.statement().size() > 1) {
            for (int i = 0; i < ctx.statement().size(); i++) {
                elseBody.add(statmentVisitor.visit(ctx.statement().get(i)));
            }
        }

        return new AST.vif(condition, ifBody, elseBody);
    }

    @Override
    public ProgramAll visitVIF1(AngularParser.VIF1Context ctx) {
        return visit(ctx.vif());
    }

    @Override
    public ProgramAll visitAttributes(AngularParser.AttributesContext ctx) {
        List<Attribute> attributes = new ArrayList<>();
        AttributeVisitor attributeVisitor = new AttributeVisitor(symbolTable);
        Attributes attributes1 = new Attributes();
        for (AngularParser.AttributeContext attrCtx : ctx.attribute()) {
            Attribute attribute = attributeVisitor.visit(attrCtx);
            attributes.add(attribute);
            if (attribute != null) {
                System.out.println("Visited attribute: " + attribute);
                attributes.add(attribute);
            } else {
                System.err.println("Null attribute returned for: " + attrCtx.getText());
            }
            attributes1.setAttributes(attributes);
        }

        return new Attributes(attributes);
    }

    @Override
    public ProgramAll visitExpression(AngularParser.ExpressionContext ctx) {
        if (!ctx.IDENTIFIER().isEmpty()) {
            for (TerminalNode id : ctx.IDENTIFIER()) {
             //   symbolTable.add(id.getText(), "expression_var");
            }
        }
        if (ctx.STRING() != null) {
      //      symbolTable.add(ctx.STRING().getText(), "string_literal", ctx.STRING().getText());
        }

        if (ctx.BOOLEAN() != null) {
            //    symbolTable.add(ctx.BOOLEAN().getText(), "boolean_literal", ctx.BOOLEAN().getText());
        }

        if (ctx.NULL() != null) {
            symbolTable.add("null", "null_literal");
        }

        if (ctx.STRING() != null) {
            return new Expression(ctx.STRING().getText(), true);
        }

        if (ctx.BOOLEAN() != null) {
            return new Expression(Boolean.parseBoolean(ctx.BOOLEAN().getText()));
        }

        if (ctx.NULL() != null) {
            return new Expression("null", false);
        }

        if (ctx.NULLCOALESCE() != null && ctx.STRING() != null) {
            List<String> ids = ctx.IDENTIFIER().stream()
                    .map(TerminalNode::getText)
                    .toList();
            boolean notPeriod = ctx.LOGICAL_NOT_PERIOD() != null;
            return new Expression(Expression.ExpressionType.IDENTIFIER_CHAIN, ids, notPeriod, ctx.STRING().getText(), null);
        }

        if (ctx.NULLCOALESCE() != null && ctx.expression() != null) {
            List<String> ids = ctx.IDENTIFIER().stream()
                    .map(TerminalNode::getText)
                    .toList();
            boolean hasNot = ctx.LOGICAL_NOT() != null;
            Expression expr = (Expression) visitExpression(ctx.expression());
            return new Expression(Expression.ExpressionType.PROPERTY_ACCESS_CHAIN, ids, hasNot, null, expr);
        }
        if (ctx.term() != null && ctx.children.size() == 1) {
            Term term = (Term) visitTerm(ctx.term(0));
            return new Expression(term);
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
            return new Expression(first, ops, others);
        }


        return null;
    }

    @Override
    public ProgramAll visitTerm(AngularParser.TermContext ctx) {
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

}