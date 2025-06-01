package Visitor;


import AST.*;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import symboltable.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClassMemberVisitor extends AngularParserBaseVisitor<classMember> {
    private SymbolTable symbolTable;

    public ClassMemberVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
    @Override
    public classMember visitMETHOD2(AngularParser.METHOD2Context ctx) {
        return visit(ctx.method());
    }

    @Override
    public classMember visitMethod(AngularParser.MethodContext ctx) {
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

        return new METHOD2(nameParts, statements);
    }

    @Override
    public classMember visitVIF2(AngularParser.VIF2Context ctx) {
        return visit(ctx.vif());
    }

    @Override
    public classMember visitVif(AngularParser.VifContext ctx) {
        ExpressionCm condition = (ExpressionCm) visitExpression(ctx.expression());

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

        return new VIF2(condition, ifBody, elseBody);
    }

    @Override
    public classMember visitLOOPSTATEMENT2(AngularParser.LOOPSTATEMENT2Context ctx) {
        return visit(ctx.loopStatement());
    }

    @Override
    public classMember visitLoopStatement(AngularParser.LoopStatementContext ctx) {
        assignmentCm init = (assignmentCm) visitAssignment(ctx.assignment(0));
        ExpressionCm condition = (ExpressionCm) visitExpression(ctx.expression());
        assignmentCm update = (assignmentCm) visitAssignment(ctx.assignment(1));

        List<Statement> body = new ArrayList<>();
        StatmentVisitor statmentVisitor = new StatmentVisitor(symbolTable);
        for (int i = 0; i < ctx.statement().size(); i++) {
            Statement stmt = statmentVisitor.visit(ctx.statement().get(i));
            body.add(stmt);
        }

        return new LOOPSTATEMENT2(init, condition, update, body);
    }


    @Override
    public classMember visitCONSTRUCTOR2(AngularParser.CONSTRUCTOR2Context ctx) {
        return visit(ctx.constructor());
    }

    @Override
    public classMember visitInputProperty(AngularParser.InputPropertyContext ctx) {
        String value = ctx.getChild(5).getText();
        boolean boolValue = Boolean.parseBoolean(value);
        List<String> identifiers = ctx.IDENTIFIER().stream()
                .map(id -> id.getText())
                .collect(Collectors.toList());

        for (String id : identifiers) {
          //  symbolTable.add(id, "input_property", String.valueOf(boolValue));
        }

        return new inputProperty(boolValue, identifiers);
    }

    @Override
    public classMember visitINPUTPROPERTY1(AngularParser.INPUTPROPERTY1Context ctx) {
        return visit(ctx.inputProperty());
    }

    @Override
    public classMember visitOutputProperty(AngularParser.OutputPropertyContext ctx) {
        List<String> identifiers = ctx.IDENTIFIER().stream()
                .map(TerminalNode::getText)
                .collect(Collectors.toList());

        String innerType = ctx.IDENTIFIER(ctx.IDENTIFIER().size() - 1).getText();

        for (String id : identifiers) {
         //   symbolTable.add(id, "output_property", innerType);
        }

        return new outputProperty(identifiers, innerType);
    }

    @Override
    public classMember visitOUTPUTPROPRTY1(AngularParser.OUTPUTPROPRTY1Context ctx) {
        return visit(ctx.outputProperty());
    }

    @Override
    public classMember visitASSI(AngularParser.ASSIContext ctx) {
return visitAssignment(ctx.assignment());
    }

    @Override
    public classMember visitAssignment(AngularParser.AssignmentContext ctx) {
        List<String> target = new ArrayList<>();
        AST.ExpressionCm value = null;
        List<AnyTypeCm> anytypes = new ArrayList<>();

        for (TerminalNode id : ctx.IDENTIFIER()) {
            String varName = id.getText();
            target.add(varName);
        }

        if (ctx.expression() != null) {
            value = (ExpressionCm) visit(ctx.expression());

        }

        if (ctx.any_type() != null && !ctx.any_type().isEmpty()) {
            for (int i = 0; i < ctx.any_type().size(); i++) {
                anytypes.add((AnyTypeCm) visit(ctx.any_type().get(i)));
            }
        }
        symbolTable.add(
                String.valueOf(target),
                "variable",
                String.valueOf(value != null ? value : anytypes)
        );
        return new ASSI(target, value, anytypes);
    }

    @Override
    public classMember visitExpression(AngularParser.ExpressionContext ctx) {
        if (!ctx.IDENTIFIER().isEmpty()) {
            for (TerminalNode id : ctx.IDENTIFIER()) {
                symbolTable.add(id.getText(), "expression_var");
            }
        }

        if (ctx.STRING() != null) {
            symbolTable.add(ctx.STRING().getText(), "string_literal", ctx.STRING().getText());
        }

        if (ctx.BOOLEAN() != null) {
            symbolTable.add(ctx.BOOLEAN().getText(), "boolean_literal", ctx.BOOLEAN().getText());
        }

        if (ctx.NULL() != null) {
            symbolTable.add("null", "null_literal");
        }
        if (ctx.STRING() != null) {
            return new ExpressionCm(ctx.STRING().getText(), true);
        }

        if (ctx.BOOLEAN() != null) {
            return new ExpressionCm(Boolean.parseBoolean(ctx.BOOLEAN().getText()));
        }

        if (ctx.NULL() != null) {
            return new ExpressionCm("null", false);
        }

        if (ctx.NULLCOALESCE() != null && ctx.STRING() != null) {
            List<String> ids = ctx.IDENTIFIER().stream()
                    .map(TerminalNode::getText)
                    .toList();
            boolean notPeriod = ctx.LOGICAL_NOT_PERIOD() != null;
            return new ExpressionCm(ExpressionCm.ExpressionType.IDENTIFIER_CHAIN, ids, notPeriod, ctx.STRING().getText(), null);
        }

        if (ctx.NULLCOALESCE() != null && ctx.expression() != null) {
            List<String> ids = ctx.IDENTIFIER().stream()
                    .map(TerminalNode::getText)
                    .toList();
            boolean hasNot = ctx.LOGICAL_NOT() != null;
            ExpressionCm expr = (ExpressionCm) visitExpression(ctx.expression());
            return new ExpressionCm(ExpressionCm.ExpressionType.PROPERTY_ACCESS_CHAIN, ids, hasNot, null, expr);
        }
        if (ctx.term() != null && ctx.children.size() == 1) {
            TermCm term = (TermCm) visitTerm(ctx.term(0));
            return new ExpressionCm(term);
        }

        if (ctx.term().size() > 1) {
            TermCm first = (TermCm) visitTerm(ctx.term(0));
            List<String> ops = ctx.children.stream()
                    .filter(c -> c.getText().equals("+") || c.getText().equals("-"))
                    .map(c -> c.getText())
                    .toList();
            List<TermCm> others = ctx.term().subList(1, ctx.term().size())
                    .stream()
                    .map(t -> (TermCm) visitTerm(t))
                    .toList();
            return new ExpressionCm(first, ops, others);
        }
        return null;
    }


    @Override
    public classMember visitConstructor(AngularParser.ConstructorContext ctx) {
        CONSTRUCTOR2 constructor = new CONSTRUCTOR2();
        symbolTable.add("constructor", "constructor");

        List<String> params = new ArrayList<>();
        if (ctx.IDENTIFIER() != null) {
            for (TerminalNode id : ctx.IDENTIFIER()) {
                String name = id.getText();
                params.add(name);
               symbolTable.add("constructor",name, "parameter");
            }
        }
        constructor.setParameters(params);

        constructor.methodCall2s = new ArrayList<>();
        for (AngularParser.MethodCallContext mcCtx : ctx.methodCall()) {
            methodcallCm methodCall = (methodcallCm) visitMethodCall(mcCtx);
            constructor.addmethodcalls(methodCall);
            symbolTable.add("constructor","constructor", String.valueOf(methodCall));
        }

        return constructor;
    }
}