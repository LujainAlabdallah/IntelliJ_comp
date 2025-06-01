package Visitor;

import AST.*;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import symboltable.*;

import java.util.ArrayList;
import java.util.List;

public class FactorVisitor extends AngularParserBaseVisitor<Factor> {
    private SymbolTable symbolTable;

    public FactorVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
    @Override
    public Factor visitNUMBER(AngularParser.NUMBERContext ctx) {
        String value = ctx.NUMBER().getText();
       // symbolTable.add("Factor", "FactorNumber",value);
        return new NumberFactor(value);
    }

    @Override
    public Factor visitBOOLEAN(AngularParser.BOOLEANContext ctx) {
        String value = ctx.BOOLEAN().getText();
       // symbolTable.add("Factor", "FactorBoolean",value);
        return new NumberFactor(value);
    }

    @Override
    public Factor visitNULL(AngularParser.NULLContext ctx) {
       // symbolTable.add("null", "null_literal");
        return new NullFactor();
    }

    @Override
    public Factor visitIDENTIFIER(AngularParser.IDENTIFIERContext ctx) {
        List<String> identifiers = new ArrayList<>();
        for (var id : ctx.IDENTIFIER()) {
            String text = id.getText();
            identifiers.add(text);
          //  symbolTable.add("Factor", "FactorIdentifier",text);
        }
        return new AST.IdentifierFactor(identifiers);
    }


}
