package AST;

import java.util.List;

public class LOOPSTATEMENT2 extends classMember {
    public assignmentCm init;
    public ExpressionCm condition;
    public assignmentCm update;
    public List<Statement> body;

    public LOOPSTATEMENT2(assignmentCm init, ExpressionCm condition, assignmentCm update, List<Statement> body) {
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
