package Visitor;

import AST.*;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MetadataVisitor extends AngularParserBaseVisitor<ComponentMetadata> {

    @Override
    public ComponentMetadata visitSELECTOR1(AngularParser.SELECTOR1Context ctx) {
        String value = ctx.STRING().getText().replace("\"", "");
        return new SELECTOR1(value);
    }

    @Override
    public ComponentMetadata visitSTANDLONE(AngularParser.STANDLONEContext ctx) {
        boolean value = Boolean.parseBoolean(ctx.BOOLEAN().getText());
        return new StandaloneMetadata(value);
    }

    @Override
    public ComponentMetadata visitTEMPLATEURL(AngularParser.TEMPLATEURLContext ctx) {
        HtmlValue htmlVal;
        ElementVisitor elementVisitor = new ElementVisitor();

        if (ctx.html().STRING() != null) {
            String path = ctx.html().STRING().getText().replace("\"", "");
            htmlVal = new HtmlString(path);
            System.out.println("HTML as string path: " + path);
        } else {
            List<Element> elements = new ArrayList<>();
            List<AngularParser.ElementContext> elementContexts = ctx.html().htmlDocument().element();

            for (AngularParser.ElementContext elementCtx : elementContexts) {
                Element element = elementVisitor.visit(elementCtx);
                if (element != null) {
                    elements.add(element);
                 //   System.out.println("Visited element: " + element); // طباعة toString()
                } else {
                    System.err.println("Null returned for element: " + elementCtx.getText());
                }
            }

            htmlVal = new HtmlDocumentValue(elements);
        }

        return new TemplateUrlMetadata(htmlVal);
    }

    @Override
    public ComponentMetadata visitIMPORTS(AngularParser.IMPORTSContext ctx) {
        List<String> imports = new ArrayList<>();
        ctx.IDENTIFIER().forEach(id -> imports.add(id.getText()));
        return new ImportsMetadata(imports);
    }

    @Override
    public ComponentMetadata visitSTYLEURL(AngularParser.STYLEURLContext ctx) {
        StyleValue styleVal;
        if (ctx.style().STRING() != null) {
            String path = ctx.style().STRING().getText().replace("\"", "");
            styleVal = new StyleString(path);
        } else {
            List<Rule> rules = new ArrayList<>();
            for (int i = 0 ; i < ctx.style().stylesheet().rule_().size();i++) {
                rules.add((Rule) visit(ctx.style().stylesheet().rule_().get(i))); // يُفترض وجود visitRule
            }
            styleVal = new StyleSheetValue(rules);
        }
        return new StyleUrlMetadata(styleVal);
    }

    @Override
    public ComponentMetadata visitRule(AngularParser.RuleContext ctx) {
        selector selector = (AST.selector) visitSelector(ctx.selector());

        List<Declaration> declarations = new ArrayList<>();
        for (int i = 0 ; i < ctx.declaration().size();i++) {
            declarations.add((Declaration) visit(ctx.declaration().get(i)));
        }

        return new AST.Rule(selector, declarations);
    }

    @Override
    public ComponentMetadata visitSelector(AngularParser.SelectorContext ctx) {
        List<String> identifiers = ctx.IDENTIFIER().stream()
                .map(id -> id.getText())
                .collect(Collectors.toList());

        return new selector(identifiers);
    }

    @Override
    public ComponentMetadata visitDeclaration(AngularParser.DeclarationContext ctx) {
        List<String> identifiers = ctx.IDENTIFIER().stream()
                .map(id -> id.getText())
                .collect(Collectors.toList());

        List<AnyType> value = new ArrayList<>();
        for (AngularParser.Any_typeContext typeCtx : ctx.any_type()) {
            AnyType anytypeValue = (AnyType) visitAny_type(typeCtx);
//System.out.println(anytypeValue);
            if (anytypeValue != null) {
               // System.out.println("Visited any_type: " + anytypeValue);
                value.add(anytypeValue);
            } else {
              //  System.err.println("Null returned for any_type: " + typeCtx.getText());
            }
        }

        // إرجاع كائن يمثل declaration
        return new Declaration(identifiers, value);
    }

    @Override
    public ComponentMetadata visitAny_type(AngularParser.Any_typeContext ctx) {
        if (ctx.LENGTH() != null) {
            return new AnyType(AnyType.Type.LENGTH, ctx.getText());
        } else if (ctx.COLOR() != null) {
            return new AnyType(AnyType.Type.COLOR, ctx.getText());
        } else if (ctx.IDENTIFIER() != null) {
            return new AnyType(AnyType.Type.IDENTIFIER, ctx.getText());
        } else if (ctx.NUMBER() != null) {
            return new AnyType(AnyType.Type.NUMBER, ctx.getText());
        } else if (ctx.STRING() != null) {
            return new AnyType(AnyType.Type.STRING, ctx.getText());
        } else if (ctx.ANY() != null) {
            return new AnyType(AnyType.Type.ANY, ctx.getText());
        } else if (ctx.product() != null || ctx.LEFT_BRACKET() != null) {
            List<Product> products = new ArrayList<>();
            for (AngularParser.ProductContext productCtx : ctx.product()) {
                ComponentMetadata p =  visitProduct(productCtx);
               // products.add(p);
            }
            return new AnyType(AnyType.Type.ARRAY, products);
        }
        return null;
    }
}

