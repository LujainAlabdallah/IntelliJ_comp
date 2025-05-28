package AST;
public class TemplateUrlMetadata extends ComponentMetadata {
    public HtmlValue html;

    public TemplateUrlMetadata(HtmlValue html) {
        this.html = html;
    }

    @Override
    public String toString() {
        return "templateUrl: " + html.toString();
    }
}
