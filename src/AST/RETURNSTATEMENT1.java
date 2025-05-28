package AST;

public class RETURNSTATEMENT1 extends ProgramAll {
    public Expression value;

    public RETURNSTATEMENT1(Expression value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "RETURNSTATEMENT1{" +
                "value=" + value +
                '}';
    }
}
