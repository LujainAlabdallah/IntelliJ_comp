package AST;
public class NGFORELEMENT1 extends Element {
    public String expression;
    public ElementContent content;

    public NGFORELEMENT1(String expression, ElementContent content) {
        this.expression = expression;
        this.content = content;
    }

    @Override
    public String toString() {
        return "<div *ngFor=\"" + expression + "\">" + content.toString() + "</div>";
    }
}
