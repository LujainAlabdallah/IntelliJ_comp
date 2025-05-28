package AST;

import java.util.List;

public class VIF2 extends classMember {
    public Expression condition;
    public List<Statement> ifBody;
    public List<Statement> elseBody;

    public VIF2(Expression condition, List<Statement>ifBody, List<Statement>elseBody) {
        this.condition = condition;
        this.ifBody=ifBody;
        this.elseBody=elseBody;
    }
    public boolean hasElseBranch() {
        return elseBody != null && !elseBody.isEmpty();
    }

    @Override
    public String toString() {
        return "ifmethodcall{" +
                "condition=" + condition +
                ", ifBody=" + ifBody +
                ", elseBody=" + elseBody +
                '}';
    }
}
