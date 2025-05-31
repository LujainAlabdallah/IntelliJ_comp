package AST;

public class RETURNSTATEMENT2 extends Statement {
    public ExpressionSt value;

    public RETURNSTATEMENT2(ExpressionSt value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ReturnStatement{" +
                "value=" + value +
                '}';
    }
}
