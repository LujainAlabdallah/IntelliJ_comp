package AST;
import java.util.List;

public class HtmlDocumentValue extends HtmlValue {
    public List<Element> elements;

    public HtmlDocumentValue(List<Element> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.toString()).append("\n");
        }
        return sb.toString();
    }
}


//@Override
//public ComponentMetadata visitTEMPLATEURL(MyLangParser.TEMPLATEURLContext ctx) {
//    HtmlValue htmlVal;
//    if (ctx.html().STRING() != null) {
//        String path = ctx.html().STRING().getText().replace("\"", "");
//        htmlVal = new HtmlString(path);
//    } else {
//        List<Element> elements = new ArrayList<>();
//        for (MyLangParser.ElementContext elementCtx : ctx.html().htmlDocument().element()) {
//            elements.add(visitElement(elementCtx)); // يفترض وجود visitElement
//        }
//        htmlVal = new HtmlDocumentValue(elements);
//    }
//    return new TemplateUrlMetadata(htmlVal);
//}
