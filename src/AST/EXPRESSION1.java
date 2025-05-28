package AST;

public class EXPRESSION1 extends Factor{
    public Expression expression;

    public EXPRESSION1(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "(" + expression.toString() + ")";
    }
}
