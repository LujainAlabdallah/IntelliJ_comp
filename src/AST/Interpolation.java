package AST;

public class Interpolation extends Element {
    public Expression expression;

    public Interpolation(Expression expression) {
        this.expression = expression;
    }
    @Override
    public String toString() {
        return "{{ " + expression.toString() + " }}";
    }
}
