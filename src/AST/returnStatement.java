package AST;

public class returnStatement extends ProgramAll{
    public Expression value;

    public returnStatement(Expression value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ReturnStatement{" +
                "value=" + value +
                '}';
    }
}
