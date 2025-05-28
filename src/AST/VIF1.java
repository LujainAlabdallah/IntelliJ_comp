package AST;

import java.util.List;

public class VIF1 extends ProgramAll {
    public Expression condition;
    public List<Statement> ifBody;
    public List<Statement> elseBody;

    public VIF1(Expression condition, List<Statement> ifBody, List<Statement> elseBody) {
        this.condition = condition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }
    public boolean hasElseBranch() {
        return elseBody != null && !elseBody.isEmpty();
    }

    @Override
    public String toString() {
        return "ifall{" +
                "condition=" + condition +
                ", ifBody=" + ifBody +
                ", elseBody=" + elseBody +
                '}';
    }
}
