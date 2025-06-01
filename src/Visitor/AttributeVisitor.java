package Visitor;

import AST.*;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import symboltable.*;

import java.util.ArrayList;
import java.util.List;

public class AttributeVisitor extends AngularParserBaseVisitor<Attribute> {
    private SymbolTable symbolTable;

    public AttributeVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public Attribute visitCLASSATTRIBUTE1(AngularParser.CLASSATTRIBUTE1Context ctx) {
        return visit(ctx.classAttribute());
    }

    @Override
    public Attribute visitClassAttribute(AngularParser.ClassAttributeContext ctx) {
        String value = stripQuotes(ctx.STRING().getText());
     //   symbolTable.add("class", "attribute", value);
        return new classAttribute(value);
    }

    @Override
    public Attribute visitSrcAttribute(AngularParser.SrcAttributeContext ctx) {
         String value = stripQuotes(ctx.STRING().getText());
     //   symbolTable.add("src", "attribute", value);
        return new srcAttribute(value);
    }

    @Override
    public Attribute visitSCRATTRIBUTE1(AngularParser.SCRATTRIBUTE1Context ctx) {
        return visit(ctx.srcAttribute());
    }

    @Override
    public Attribute visitAltAttribute(AngularParser.AltAttributeContext ctx) {
        String value = stripQuotes(ctx.STRING().getText());
      //  symbolTable.add("alt", "attribute", value);
        return new altAttribute(value);
    }

    @Override
    public Attribute visitALTATTRIBUTE1(AngularParser.ALTATTRIBUTE1Context ctx) {
        return visit(ctx.altAttribute());
    }

    @Override
    public Attribute visitStyleAttribute(AngularParser.StyleAttributeContext ctx) {
        String value = stripQuotes(ctx.STRING().getText());
      //  symbolTable.add("style", "attribute", value);
        return new styleAttribute(value);
    }

    @Override
    public Attribute visitSTYLEATTRIBUTE1(AngularParser.STYLEATTRIBUTE1Context ctx) {
        return visit(ctx.styleAttribute());
    }

    @Override
    public Attribute visitClickAttribute(AngularParser.ClickAttributeContext ctx) {
        String value = stripQuotes(ctx.STRING().getText());
     //   symbolTable.add("click", "event", value);
        return new clickAttribute(value);
    }

    @Override
    public Attribute visitCLICKATTRIBUTE1(AngularParser.CLICKATTRIBUTE1Context ctx) {
        return visit(ctx.clickAttribute());
    }

    @Override
    public Attribute visitPropertyBinding(AngularParser.PropertyBindingContext ctx) {
        List<String> ids = new ArrayList<>();
        for (var id : ctx.IDENTIFIER()) {
            ids.add(id.getText());
       //     symbolTable.add(id.getText(), "property_binding");
        }
        String value = stripQuotes(ctx.STRING().getText());
        return new propertyBinding(ids, value);
    }

    @Override
    public Attribute visitPROPERTYBINDING1(AngularParser.PROPERTYBINDING1Context ctx) {
        return visit(ctx.propertyBinding());
    }

    @Override
    public Attribute visitEventBinding(AngularParser.EventBindingContext ctx) {
        List<String> ids = new ArrayList<>();
        for (var id : ctx.IDENTIFIER()) {
            ids.add(id.getText());
        //    symbolTable.add(id.getText(), "event_binding");
        }
        String value = stripQuotes(ctx.STRING().getText());
        return new eventBinding(ids, value);
    }

    @Override
    public Attribute visitEVENTBINDING1(AngularParser.EVENTBINDING1Context ctx) {
        return visit(ctx.eventBinding());
    }

    private String stripQuotes(String s) {
        if (s.startsWith("\"") && s.endsWith("\"") && s.length() >= 2) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }
}
