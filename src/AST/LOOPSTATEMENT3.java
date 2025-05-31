package AST;

import java.util.List;

public class LOOPSTATEMENT3 extends Statement{
    public ASSIGMENT2 init;
    public ExpressionSt condition;
    public ASSIGMENT2 update;
    public List<Statement> body;

    public LOOPSTATEMENT3(ASSIGMENT2 init, ExpressionSt condition, ASSIGMENT2 update, List<Statement> body) {
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
