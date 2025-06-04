package Visitor;

import AST.*;
import SemanticError.DuplicateChecker;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import symboltable.SymbolTable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MetadataVisitor extends AngularParserBaseVisitor<ComponentMetadata> {
    private SymbolTable symbolTable;

    public MetadataVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
    @Override
    public ComponentMetadata visitSELECTOR1(AngularParser.SELECTOR1Context ctx) {
        String value = ctx.STRING().getText().replace("\"", "");
        DuplicateChecker duplicateChecker = new DuplicateChecker(symbolTable);
      if (! duplicateChecker.check("selector")){
        symbolTable.add("selector", "component_metadata", value);
      }
        return new SELECTOR1(value);
    }

    @Override
    public ComponentMetadata visitSTANDLONE(AngularParser.STANDLONEContext ctx) {
        boolean value = Boolean.parseBoolean(ctx.BOOLEAN().getText());
        DuplicateChecker duplicateChecker = new DuplicateChecker(symbolTable);
        if (! duplicateChecker.check("standalone")) {
            symbolTable.add("standalone", "component_metadata", String.valueOf(value));
        }
        return new StandaloneMetadata(value);
    }

    @Override
    public ComponentMetadata visitTEMPLATEURL(AngularParser.TEMPLATEURLContext ctx) {
        HtmlValue htmlVal;
        ElementVisitor elementVisitor = new ElementVisitor(symbolTable);

        if (ctx.html().STRING() != null) {
            String path = ctx.html().STRING().getText().replace("\"", "");
            symbolTable.add("templateUrl", "string_path", path);
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
        ctx.IDENTIFIER().forEach(id -> {
            imports.add(id.getText());
      //   symbolTable.add(id.getText(), "import");
        });
        return new ImportsMetadata(imports);
    }

    @Override
    public ComponentMetadata visitSTYLEURL(AngularParser.STYLEURLContext ctx) {
        StyleValue styleVal;
        if (ctx.style().STRING() != null) {
            String path = ctx.style().STRING().getText().replace("\"", "");
         //   symbolTable.add("styleUrl", "string_path", path);
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
        for (String id : identifiers) {
          //  symbolTable.add(id, "css_selector");
        }

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
        for (String id : identifiers) {
           // symbolTable.add(id, "css_declaration");
        }
        return new Declaration(identifiers, value);
    }

    @Override
    public ComponentMetadata visitAny_type(AngularParser.Any_typeContext ctx) {
        if (ctx.LENGTH() != null) {
        //    symbolTable.add(ctx.getText(), "length_value");
            return new AnyType(AnyType.Type.LENGTH, ctx.getText());
        } else if (ctx.COLOR() != null) {
          //  symbolTable.add(ctx.getText(), "color_value");
            return new AnyType(AnyType.Type.COLOR, ctx.getText());
        } else if (ctx.IDENTIFIER() != null) {
         //   symbolTable.add(ctx.getText(), "identifier_value");
            return new AnyType(AnyType.Type.IDENTIFIER, ctx.getText());
        } else if (ctx.NUMBER() != null) {
          //  symbolTable.add(ctx.getText(), "number_value");
            return new AnyType(AnyType.Type.NUMBER, ctx.getText());
        } else if (ctx.STRING() != null) {
      //      symbolTable.add(ctx.getText(), "string_value");
            return new AnyType(AnyType.Type.STRING, ctx.getText());
        } else if (ctx.ANY() != null) {
            symbolTable.add(ctx.getText(), "any_type");
            return new AnyType(AnyType.Type.ANY, ctx.getText());
        } else if (ctx.product() != null || ctx.LEFT_BRACKET() != null) {
            List<Product> products = new ArrayList<>();
            for (AngularParser.ProductContext productCtx : ctx.product()) {
                ComponentMetadata p = visitProduct(productCtx);
            }
            return new AnyType(AnyType.Type.ARRAY, products);
        }
        return null;
    }
}

