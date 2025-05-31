//package Visitor;
//
//import AST.*;
//import antlr.AngularParser;
//import antlr.AngularParserBaseVisitor;
//import org.antlr.v4.runtime.tree.TerminalNode;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class BaseVisitor extends AngularParserBaseVisitor {
//    @Override
//    public Program visitProgram(AngularParser.ProgramContext ctx) {
//        List<ProgramAll> list = new ArrayList<>();
//        for (AngularParser.AllContext allCtx : ctx.all()) {
//            ProgramAll node = (ProgramAll) visit(allCtx); // سيعود كائن من النوع الصحيح مثل Service, Assignment, إلخ
//            list.add(node);
//        }
//        return new Program(list);
//    }
//
//    @Override
//    public ImportStatement visitImportStatements(AngularParser.ImportStatementsContext ctx) {
//        String moduleName = ctx.STRING().getText().replace("\"", "");
//        return new ImportStatement(moduleName);
//    }
//
//    @Override
//    public Service visitService(AngularParser.ServiceContext ctx) {
//
//        List<String> identifiers = ctx.IDENTIFIER().stream()
//                .map(id -> id.getText())
//                .collect(Collectors.toList());
//        String name = identifiers.isEmpty() ? "" : identifiers.get(identifiers.size() - 1);
//        return new Service(identifiers, name);
//    }
//
//    @Override
//    public ComponentDeclaration visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
//        List<AngularParser.Component_metadataContext> metadataList = new ArrayList<>();
//
//        for (AngularParser.Component_metadataContext metaCtx : ctx.component_metadata()) {
//            metadataList.add(metaCtx);
//        }
//
//        return new ComponentDeclaration(metadataList);
//    }
//
//    @Override
//    public ComponentMetadata visitSELECTOR(AngularParser.SELECTORContext ctx) {
//        String value = ctx.STRING().getText().replace("\"", "");
//        return new SelectorMetadata(value);
//    }
//
//    @Override
//    public ComponentMetadata visitSTANDLONE(AngularParser.STANDLONEContext ctx) {
//        boolean value = Boolean.parseBoolean(ctx.BOOLEAN().getText());
//        return new StandaloneMetadata(value);
//    }
//
//    @Override
//    public ComponentMetadata visitIMPORTS(AngularParser.IMPORTSContext ctx) {
//        List<String> imports = new ArrayList<>();
//        ctx.IDENTIFIER().forEach(id -> imports.add(id.getText()));
//        return new ImportsMetadata(imports);
//    }
//
//    @Override
//    public ComponentMetadata visitTEMPLATEURL(AngularParser.TEMPLATEURLContext ctx) {
//        HtmlValue htmlVal;
//        if (ctx.html().STRING() != null) {
//            String path = ctx.html().STRING().getText().replace("\"", "");
//            htmlVal = new HtmlString(path);
//        } else {
//            List<Element> elements = new ArrayList<>();
//            for (AngularParser.ElementContext elementCtx : ctx.html().htmlDocument().element()) {
//                elements.add(visitElement(elementCtx)); // يفترض وجود visitElement
//            }
//            htmlVal = new HtmlDocumentValue(elements);
//        }
//        return new TemplateUrlMetadata(htmlVal);
//    }
//
//
//    @Override
//    public ComponentMetadata visitSTYLEURL(AngularParser.STYLEURLContext ctx) {
//        StyleValue styleVal;
//        if (ctx.style().STRING() != null) {
//            String path = ctx.style().STRING().getText().replace("\"", "");
//            styleVal = new StyleString(path);
//        } else {
//            List<Rule> rules = new ArrayList<>();
//            for (AngularParser.RuleContext ruleCtx : ctx.style().stylesheet().rule()) {
//                rules.add(visitRule(ruleCtx)); // يُفترض وجود visitRule
//            }
//            styleVal = new StyleSheetValue(rules);
//        }
//        return new StyleUrlMetadata(styleVal);
//    }

//    public Rule visitRule(AngularParser.RuleContext ctx) {
//        Selector selector = visitSelector(ctx.selector());
//
//        // زيارة التصريحات (declarations)
//        List<Declaration> declarations = new ArrayList<>();
//        for (AngularParser.DeclarationContext declCtx : ctx.declaration()) {
//            declarations.add(visitDeclaration(declCtx));
//        }
//
//        return new Rule(selector, declarations);
//    }
//
//    @Override
//    public Declaration visitDeclaration(AngularParser.DeclarationContext ctx) {
//        List<String> property = new ArrayList<>();
//        List<AnyType> values = new ArrayList<>();
//
//        // جمع أسماء الخصائص، مثل: font-size → ["font", "size"]
//        property.add(ctx.IDENTIFIER(0).getText());
//        for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
//            property.add(ctx.IDENTIFIER(i).getText());
//        }
//
//        // القيمة الأولى
//        if (ctx.any_type(0) != null) {
//            values.add(visitAny_type(ctx.any_type(0)));
//        }
//
//        // القيم الإضافية المفصولة بفواصل
//        for (int i = 1; i < ctx.any_type().size(); i++) {
//            values.add(visitAny_type(ctx.any_type(i)));
//        }
//
//        return new Declaration(property, values);
//    }

//    @Override
//    public Selector visitSelector(AngularParser.SelectorContext ctx) {
//        List<String> identifiers = new ArrayList<>();
//        for (TerminalNode id : ctx.IDENTIFIER()) {
//            identifiers.add(id.getText());
//        }
//        return new Selector(identifiers);
//    }
//
//    @Override
//    public HeaderElement visitHeaderElement(AngularParser.HeaderElementContext ctx) {
//        String expr = ctx.interpolation().getText();
//        return new HeaderElement(expr);
//    }
//
//    @Override
//    public Element visitHEADERELEMENT(AngularParser.HEADERELEMENTContext ctx) {
//        return visitHeaderElement(ctx.headerElement());
//    }
//
//    @Override
//    public ImageElement visitImageElement(AngularParser.ImageElementContext ctx) {
//        Attributes attrs = new Attributes();
//        if (ctx.image().attributes() != null) {
//            List<Attribute> attrList = (List<Attribute>) visitAttributes(ctx.image().attributes());
//            attrs.setAttributes(attrList); // بافتراض وجود method في Attributes لتعيين القائمة
//        }
//        return new ImageElement(attrs);
//    }
//
//    @Override
//    public Element visitIMAGEELEMENT(AngularParser.IMAGEELEMENTContext ctx) {
//        return visitImageElement(ctx.imageElement());
//    }
//
//    @Override
//    public Element visitComponentElement(AngularParser.ComponentElementContext ctx) {
//        return visitCompElement(ctx.compElement());
//    }
//
//    @Override
//    public ComponentElement visitCompElement(AngularParser.CompElementContext ctx) {
//        Attributes attrs = new Attributes();
//        if (ctx.attributes() != null) {
//            List<Attribute> attrList = (List<Attribute>) visitAttributes(ctx.attributes());
//            attrs.setAttributes(attrList); // أو استخدم constructor إذا متوفر
//        }
//
//        String name = ctx.getText();
//        return new ComponentElement(name, attrs);
//    }
//
//    @Override
//    public Element visitBUTTONELEMENT(AngularParser.BUTTONELEMENTContext ctx) {
//        return visitButtonElement(ctx.buttonElement());
//    }
//
//    @Override
//    public ButtonElement visitButtonElement(AngularParser.ButtonElementContext ctx) {
//        List<Attribute> attrs = new ArrayList<>();
//        if (ctx.button().attributes() != null)
//            attrs = (List<Attribute>) visitAttributes(ctx.button().attributes());
//        String label = ctx.STRING().getText().replace("\"", "");
//        return new ButtonElement((Attributes) attrs, label);
//    }
//
//    @Override
//    public Object visitPARAGRAPHELEMENT(AngularParser.PARAGRAPHELEMENTContext ctx) {
//        return visitParagraphElement(ctx.paragraphElement());
//    }
//
//    @Override
//    public ParagraphElement visitParagraphElement(AngularParser.ParagraphElementContext ctx) {
//        String expr = ctx.interpolation().getText();
//        return new ParagraphElement(expr);
//    }
//
//    @Override
//    public NgForElement visitNgForElement(AngularParser.NgForElementContext ctx) {
//        String expr = ctx.STRING().getText().replace("\"", "");
//        ElementContent content = null;
//        if (ctx.elementContent() != null) {
//            if (ctx.STRING() != null) {
//                content = visitSTRING(ctx.STRING());
//            }
//        }
//        return new NgForElement(expr, content);
//    }
//
//    @Override
//    public ElementContent visitSTRING(AngularParser.STRINGContext ctx) {
//        if (ctx.STRING() != null) {
//            String text = ctx.STRING().getText().replace("\"", "");
//            return new StringContent(text);
//        }
//        return null;
//    }
//
//    @Override
//    public Element visitNGFORELEMENT(AngularParser.NGFORELEMENTContext ctx) {
//        return visitNgForElement(ctx.ngForElement());
//    }
//
//    @Override
//    public AnyType visitAny_type(AngularParser.Any_typeContext ctx) {
//        if (ctx.LENGTH() != null || ctx.COLOR() != null || ctx.IDENTIFIER() != null
//                || ctx.NUMBER() != null || ctx.STRING() != null || ctx.ANY() != null) {
//            String value = ctx.getText();
//            return new PrimitiveType(value);
//        } else if (ctx.product() != null || ctx.LEFT_BRACKET() != null) {
//            List<Product> products = new ArrayList<>();
//            for (AngularParser.ProductContext productCtx : ctx.product()) {
//                Product p = (Product) visitProduct(productCtx);
//                products.add(p);
//            }
//            return new ProductList(products);
//        }
//        return null;
//    }
//
//    @Override
//    public Object visitSERVICE(AngularParser.SERVICEContext ctx) {
//        return visitService(ctx.service());
//    }
//
//    @Override
//    public Object visitCOMPONENTDECLARATION(AngularParser.COMPONENTDECLARATIONContext ctx) {
//        return visitComponentDeclaration(ctx.componentDeclaration());
//    }
//
//    @Override
//    public Object visitIMPORTSTATEMENT1(AngularParser.IMPORTSTATEMENT1Context ctx) {
//        return visitImportStatements(ctx.importStatements());
//    }
//
//    @Override
//    public Object visitCONSTRUCTOR(AngularParser.CONSTRUCTORContext ctx) {
//        return visitConstructor(ctx.constructor());
//    }
//
//    @Override
//    public Object visitCONSTRUCTOR1(AngularParser.CONSTRUCTOR1Context ctx) {
//        return visitConstructor(ctx.constructor());
//    }
//
//    @Override
//    public Constructor visitConstructor(AngularParser.ConstructorContext ctx) {
//        List<ConstructorParameter> params = new ArrayList<>();
//
//        // الجزء الأول من المعاملات (قبل الأقواس أو الفاصلات)
//        if (!ctx.IDENTIFIER().isEmpty()) {
//            List<TerminalNode> identifiers = ctx.IDENTIFIER();
//            int i = 0;
//            while (i + 1 < identifiers.size()) {
//                String paramName = identifiers.get(i).getText();
//                String paramType = identifiers.get(i + 1).getText();
//                params.add(new ConstructorParameter(paramName, paramType));
//                i += 2;
//            }
//        }
//
//        // معالجة methodCalls داخل جسم الكونستركتر
//        List<MethodCall> calls = new ArrayList<>();
//        for (var callCtx : ctx.methodCall()) {
//            calls.add(visitMethodCall(callCtx));
//        }
//
//        return new Constructor(params, calls);
//    }
//
//    @Override
//    public Object visitMETHODCALL1(AngularParser.METHODCALL1Context ctx) {
//        return visitMethodCall(ctx.methodCall());
//    }
//
//    @Override
//    public Object visitMETHODCALL(AngularParser.METHODCALLContext ctx) {
//        return visitMethodCall(ctx.methodCall());
//    }
//
//    @Override
//    public MethodCall visitMethodCall(AngularParser.MethodCallContext ctx) {
//        String objectName = "this";
//        String methodName = "";
//        List<Expression> args = new ArrayList<>();
//        List<AnyType> anyTypes = new ArrayList<>();
//
//        if (ctx.LEFT_PAREN() != null) {
//            // النمط: this.obj.method(args)
//            List<TerminalNode> identifiers = ctx.IDENTIFIER();
//            if (identifiers.size() >= 2) {
//                objectName = identifiers.get(0).getText();
//                methodName = identifiers.get(1).getText();
//            } else if (identifiers.size() == 1) {
//                methodName = identifiers.get(0).getText();
//            }
//
//            if (ctx.arguments() != null) {
//                args = (List<Expression>) visitArguments(ctx.arguments());
//            }
//        } else if (ctx.ASSIGN() != null) {
//            // النمط: this.obj = any_type
//            objectName = ctx.IDENTIFIER(0).getText(); // obj
//            methodName = "assign"; // يمكن تخصيصه حسب السياق
//            for (var anyCtx : ctx.any_type()) {
//                anyTypes.add(visitAny_type(anyCtx));
//            }
//        }
//
//        return new MethodCall(objectName, methodName, args, anyTypes);
//    }
//
//    @Override
//    public Object visitFUNCTIONCALL1(AngularParser.FUNCTIONCALL1Context ctx) {
//        return super.visitFUNCTIONCALL1(ctx);
//    }
//
//    @Override
//    public FunctionCall visitFunctionCall(AngularParser.FunctionCallContext ctx) {
//        String functionName = ctx.IDENTIFIER().toString();
//        List<Expression> args = new ArrayList<>();
//        AnyType anyType = null;
//
//        // زيارة محتوى call: يمكن أن يكون arguments أو any_type
//        if (ctx.arguments() != null) {
//            for (var exprCtx : ctx.arguments().expression()) {
//                args.add(visitExpression(exprCtx));
//            }
//        } else if (ctx.any_type() != null) {
//            anyType = visitAny_type(ctx.any_type());
//        }
//
//        return new FunctionCall(functionName, args, anyType);
//    }
//
//    @Override
//    public Object visitDivElement(AngularParser.DivElementContext ctx) {
//        Attributes attributes = null;
//        List<ElementContent> contents = new ArrayList<>();
//        List<Element> children = new ArrayList<>();
//
//        if (ctx.div().attributes() != null) {
//            attributes = (Attributes) visitAttributes(ctx.div().attributes());
//        } else {
//            attributes = new Attributes(new ArrayList<>()); // default empty attributes
//        }
//
//        if (ctx.div().elementContent() != null) {
//            for (var ec : ctx.div().elementContent()) {
//                contents.add(visitElementContent(ec));
//            }
//        }
//
//        if (ctx.element() != null) {
//            for (var el : ctx.element()) {
//                children.add(visitElement(el));
//            }
//        }
//
//        return new DivElement(attributes, contents, children);
//    }
//
//    @Override
//    public Attributes visitAttributes(AngularParser.AttributesContext ctx) {
//        List<Attribute> list = new ArrayList<>();
//        for (AngularParser.AttributeContext attrCtx : ctx.attribute()) {
//            Attribute attr = (Attribute) attrCtx.accept(this); // استخدم الزائر الخاص بكل attribute
//            list.add(attr);
//        }
//        return new Attributes(list);
//    }
//    @Override
//    public Attribute visitCLASSATTRIBUTE(AngularParser.CLASSATTRIBUTEContext ctx) {
//        String value = stripQuotes(ctx.STRING().getText());
//        return new ClassAttribute(value);
//    }
//
//    @Override
//    public Attribute visitSCRATTRIBUTE(AngularParser.SCRATTRIBUTEContext ctx) {
//        String value = stripQuotes(ctx.STRING().getText());
//        return new SrcAttribute(value);
//    }
//
//    @Override
//    public Attribute visitALTATTRIBUTE(AngularParser.ALTATTRIBUTEContext ctx) {
//        String value = stripQuotes(ctx.STRING().getText());
//        return new AltAttribute(value);
//    }
//
//    @Override
//    public Attribute visitSTYLEATTRIBUTE(AngularParser.STYLEATTRIBUTEContext ctx) {
//        String value = stripQuotes(ctx.STRING().getText());
//        return new StyleAttribute(value);
//    }
//
//    @Override
//    public Attribute visitCLICKATTRIBUTE(AngularParser.CLICKATTRIBUTEContext ctx) {
//        String value = stripQuotes(ctx.STRING().getText());
//        return new ClickAttribute(value);
//    }
//
//    @Override
//    public Attribute visitPROPERTYBINDING(AngularParser.PROPERTYBINDINGContext ctx) {
//        List<String> ids = new ArrayList<>();
//        for (var id : ctx.IDENTIFIER()) {
//            ids.add(id.getText());
//        }
//        String value = stripQuotes(ctx.STRING().getText());
//        return new PropertyBinding(ids, value);
//    }
//
//    @Override
//    public Attribute visitEVENTBINDING(AngularParser.EVENTBINDINGContext ctx) {
//        List<String> ids = new ArrayList<>();
//        for (var id : ctx.IDENTIFIER()) {
//            ids.add(id.getText());
//        }
//        String value = stripQuotes(ctx.STRING().getText());
//        return new EventBinding(ids, value);
//    }
//
//
//    private String stripQuotes(String s) {
//        if (s.startsWith("\"") && s.endsWith("\"") && s.length() >= 2) {
//            return s.substring(1, s.length() - 1);
//        }
//        return s;
//    }
//}