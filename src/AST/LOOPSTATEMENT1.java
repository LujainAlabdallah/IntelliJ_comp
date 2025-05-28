package AST;

import java.util.List;

public class LOOPSTATEMENT1 extends ProgramAll {
    public assignment init;
    public Expression condition;
    public assignment update;
    public List<Statement> body;

    public LOOPSTATEMENT1(assignment init, Expression condition, assignment update, List<Statement> body) {
        this.init = init;
        this.condition = condition;
        this.update = update;
        this.body = body;
    }

    @Override
    public String toString() {
        return "LOOPSTATEMENT{" +
                "init=" + init +
                ", condition=" + condition +
                ", update=" + update +
                ", body=" + body +
                '}';
    }
}
