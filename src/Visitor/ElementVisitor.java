package Visitor;

import AST.*;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import symboltable.*;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class ElementVisitor extends AngularParserBaseVisitor<Element> {
    private SymbolTable symbolTable;

    public ElementVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public Element visitAttributes(AngularParser.AttributesContext ctx) {
        List<Attribute> attributes = new ArrayList<>();
        AttributeVisitor attributeVisitor = new AttributeVisitor(symbolTable);
        Attributes attributes1 = new Attributes();
        for (AngularParser.AttributeContext attrCtx : ctx.attribute()) {
            Attribute attribute = attributeVisitor.visit(attrCtx);
            attributes.add(attribute);
//            if (attribute != null) {
//                System.out.println("Visited attribute: " + attribute);
//                attributes.add(attribute);
//            } else {
//                System.err.println("Null attribute returned for: " + attrCtx.getText());
//            }
            attributes1.setAttributes(attributes);
        }

        return new Attributes(attributes);
    }

    @Override
    public Element visitHeaderElement(AngularParser.HeaderElementContext ctx) {
        String expr = ctx.interpolation().getText();
        symbolTable.add("header_expr", "interpolation", expr);
        return new headerElement(expr);
    }

    @Override
    public Element visitHEADERELEMENT1(AngularParser.HEADERELEMENT1Context ctx) {
        return visit(ctx.headerElement());
    }

    @Override
    public Element visitImageElement(AngularParser.ImageElementContext ctx) {

        Attributes attrs = null;
        if (ctx.image().attributes() != null) {
            attrs = (Attributes) visitAttributes(ctx.image().attributes());
            symbolTable.add("image_attr", attrs.toString());

            if (attrs != null) {
            //    System.out.println("Visited attributes:");
                for (Attribute attr : attrs.getAttributes()) {
                 //  symbolTable.add(attr.getName(), "image_attr", attr.getValue());

                    //      System.out.println(attr);
                }
            } else {
                System.err.println("visitAttributes returned null.");
            }
        }

        return new imageElement(attrs);
    }

    @Override
    public Element visitIMAGEELEMENT1(AngularParser.IMAGEELEMENT1Context ctx) {
        return visit(ctx.imageElement());
    }

    @Override
    public Element visitCompElement(AngularParser.CompElementContext ctx) {
        if (ctx.attributes() != null) {
            Attributes attrs = (Attributes) visit(ctx.attributes());
            return new CompElement(attrs);
        } else {
            List<String> identifiers = ctx.IDENTIFIER().stream()
                    .map(id -> id.getText())
                    .collect(Collectors.toList());
            for (String id : identifiers) {
                symbolTable.add(id, "component_identifier");
            }
            return new CompElement(identifiers);
        }
    }

    @Override
    public Element visitComponentElement(AngularParser.ComponentElementContext ctx) {
        if (ctx.OPEN_APP() != null) {
            List<String> identifiers = ctx.IDENTIFIER().stream()
                    .map(id -> id.getText())
                    .collect(Collectors.toList());
            for (String id : identifiers) {
                symbolTable.add(id, "component_tag");
            }
            CompElement comp = (CompElement) visitCompElement(ctx.compElement());
            return new componentElement(identifiers, comp);
        } else {
            // Case: NGFOR DIV
            String ngForValue = ctx.STRING().getText();
            symbolTable.add("ngFor", "directive", ngForValue);
            ElementContantVisitor elementContantVisitor = new ElementContantVisitor(symbolTable);
            ElementContent content = elementContantVisitor.visit(ctx.elementContent());
            return new componentElement(ngForValue, content);
        }
    }

    @Override
    public Element visitCOMPONENTELEMENT1(AngularParser.COMPONENTELEMENT1Context ctx) {
        return visit(ctx.componentElement());
    }

    @Override
    public Element visitButtonElement(AngularParser.ButtonElementContext ctx) {
        List<Attribute> attrs = new ArrayList<>();
        if (ctx.button().attributes() != null)
            attrs = (List<Attribute>) visitAttributes(ctx.button().attributes());
        String label = ctx.STRING().getText().replace("\"", "");
        symbolTable.add("button", "label", label);
        return new buttonElement((Attributes) attrs, label);
    }


    @Override
    public Element visitBUTTONELEMENT1(AngularParser.BUTTONELEMENT1Context ctx) {
        return visit(ctx.buttonElement());
    }

    @Override
    public Element visitParagraphElement(AngularParser.ParagraphElementContext ctx) {
        String expr = ctx.interpolation().getText();
        symbolTable.add("paragraph_expr", "interpolation", expr);
        return new paragraphElement(expr);
    }
    @Override
    public Element visitPARAGRAPHELEMENT1(AngularParser.PARAGRAPHELEMENT1Context ctx) {
        return visit(ctx.paragraphElement());
    }

    @Override
    public Element visitNgForElement(AngularParser.NgForElementContext ctx) {
        String expr = ctx.STRING().getText().replace("\"", "");
        symbolTable.add("ngFor", "directive", expr);
        ElementContent content = null;
        ElementContantVisitor elementContantVisitor = new ElementContantVisitor(symbolTable);
        if (ctx.elementContent() != null) {
            if (ctx.STRING() != null) {
                content = elementContantVisitor.visit(ctx.elementContent());
            }
        }
        return new ngForElement(expr, content);
    }

    @Override
    public Element visitNGFORELEMENT1(AngularParser.NGFORELEMENT1Context ctx) {
        return visit(ctx.ngForElement());
    }

    @Override
    public Element visitDiv(AngularParser.DivContext ctx) {
        if (ctx.attributes() != null) {
            ElementContantVisitor elementContantVisitor = new ElementContantVisitor(symbolTable);
            Attributes attributes = (Attributes) visitAttributes(ctx.attributes());
            List<ElementContent> contentList = new ArrayList<>();
            for (int i = 0 ; i < ctx.elementContent().size();i++){
                contentList.add(elementContantVisitor.visit(ctx.elementContent().get(i)));
            }
            return new DivNode(attributes, contentList);
        } else {
            return new DivNode(); // empty div
        }
    }

    @Override
    public Element visitDivElement(AngularParser.DivElementContext ctx) {
        DivNode divNode = (DivNode) visitDiv(ctx.div());

        List<ProgramAll> children = new ArrayList<>();
        ElementVisitor elementVisitor = new ElementVisitor(symbolTable);
                for (int i = 0 ; i < ctx.element().size();i++){
                    children.add(elementVisitor.visit(ctx.element().get(i)));
                }

        return new divElement(divNode, children);
    }

    @Override
    public Element visitDIVELEMENT1(AngularParser.DIVELEMENT1Context ctx) {
        return visit(ctx.divElement());
    }
}
