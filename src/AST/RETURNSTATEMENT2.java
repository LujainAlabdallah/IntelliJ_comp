package AST;

public class RETURNSTATEMENT2 extends Statement {
    public Expression value;

    public RETURNSTATEMENT2(Expression value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ReturnStatement{" +
                "value=" + value +
                '}';
    }
}
