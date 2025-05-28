package AST;

import java.util.List;

public class loopStatement extends ProgramAll {
    public assignment init;
    public Expression condition;
    public assignment update;
    public List<Statement> body;

    public loopStatement(assignment init, Expression condition, assignment update, List<Statement> body) {
        this.init = init;
        this.condition = condition;
        this.update = update;
        this.body = body;
    }

    @Override
    public String toString() {
        return "LoopStatement{" +
                "init=" + init +
                ", condition=" + condition +
                ", update=" + update +
                ", body=" + body +
                '}';
    }
}