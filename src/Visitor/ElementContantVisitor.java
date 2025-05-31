package Visitor;

import AST.*;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;

public class ElementContantVisitor extends AngularParserBaseVisitor<ElementContent> {
    @Override
    public ElementContent visitSTRING(AngularParser.STRINGContext ctx) {
        String rawText = ctx.STRING().getText();
        String cleanText = rawText.substring(1, rawText.length() - 1); // إزالة علامات " "

        return new StringContent(cleanText);
    }

    @Override
    public ElementContent visitIDENTIFIER1(AngularParser.IDENTIFIER1Context ctx) {
        String name = ctx.IDENTIFIER().getText();
        return new IdentifierContent(name);
    }

    @Override
    public ElementContent visitINTERPOLATION1(AngularParser.INTERPOLATION1Context ctx) {
        Expression expr = (Expression) ctx.getChild(0);
        return new INTERPOLATION1(expr);
    }

}
