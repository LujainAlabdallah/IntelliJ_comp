package AST;
public class INTERPOLATION1 extends ElementContent {
    public Expression expression;

    public INTERPOLATION1(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "{{" + expression.toString() + "}}";
    }
}
