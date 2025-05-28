package AST;

public class HtmlString extends HtmlValue {
    public String value;

    public HtmlString(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\"" + value + "\"";
    }
}
