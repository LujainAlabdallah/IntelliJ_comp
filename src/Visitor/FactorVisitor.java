package Visitor;

import AST.*;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class FactorVisitor extends AngularParserBaseVisitor<Factor> {
    @Override
    public Factor visitNUMBER(AngularParser.NUMBERContext ctx) {
        String value = ctx.NUMBER().getText();
        return new NumberFactor(value);
    }

    @Override
    public Factor visitBOOLEAN(AngularParser.BOOLEANContext ctx) {
        String value = ctx.BOOLEAN().getText();
        return new NumberFactor(value);
    }

    @Override
    public Factor visitNULL(AngularParser.NULLContext ctx) {
        return new NullFactor();
    }

    @Override
    public Factor visitIDENTIFIER(AngularParser.IDENTIFIERContext ctx) {
        List<String> identifiers = new ArrayList<>();
        for (var id : ctx.IDENTIFIER()) {
            identifiers.add(id.getText());
        }
        return new AST.IdentifierFactor(identifiers);
    }


}
