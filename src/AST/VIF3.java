package AST;

import java.util.List;

public class VIF3 extends Statement  {
    public Expression condition;
    public List<Statement> ifBody;
    public List<Statement> elseBody; // يمكن أن تكون null إذا لم يوجد else

    public void IfStatement(Expression condition, List<Statement> ifBody, List<Statement> elseBody) {
        this.condition = condition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }

    public boolean hasElseBranch() {
        return elseBody != null && !elseBody.isEmpty();
    }

    @Override
    public String toString() {
        return "if{" +
                "condition=" + condition +
                ", ifBody=" + ifBody +
                ", elseBody=" + elseBody +
                '}';
    }
}
