package Visitor;

import AST.*;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import symboltable.*;

public class ElementContantVisitor extends AngularParserBaseVisitor<ElementContent> {
    private SymbolTable symbolTable;
    public ElementContantVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
    @Override
    public ElementContent visitSTRING(AngularParser.STRINGContext ctx) {
        String rawText = ctx.STRING().getText();
        String cleanText = rawText.substring(1, rawText.length() - 1); // إزالة علامات " "
        symbolTable.add(cleanText, "element_string");
        return new StringContent(cleanText);
    }

    @Override
    public ElementContent visitIDENTIFIER1(AngularParser.IDENTIFIER1Context ctx) {
        String name = ctx.IDENTIFIER().getText();
        symbolTable.add(name, "element_identifier");
        return new IdentifierContent(name);
    }

    @Override
    public ElementContent visitINTERPOLATION1(AngularParser.INTERPOLATION1Context ctx) {
        Expression expr = (Expression) ctx.getChild(0);
        symbolTable.add("interpolation", "interpolation_expr", expr.toString());
        return new INTERPOLATION1(expr);
    }

}
