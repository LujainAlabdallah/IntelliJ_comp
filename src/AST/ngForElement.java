package AST;

public class ngForElement extends Element {
    public String expression;
    public ElementContent content;

    public ngForElement(String expression, ElementContent content) {
        this.expression = expression;
        this.content = content;
    }

    @Override
    public String toString() {
        return "<div *ngFor=\"" + expression + "\">" + content.toString() + "</div>";
    }
}
