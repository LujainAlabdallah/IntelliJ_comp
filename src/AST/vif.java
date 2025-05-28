package AST;

import java.util.List;

public class vif extends ProgramAll {
    public Expression condition;
    public List<Statement> ifBody;
    public List<Statement> elseBody;

    public vif(Expression condition,List<Statement> ifBody, List<Statement> elseBody) {
        this.condition = condition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }

    @Override
    public String toString() {
        return "vif{" +
                "condition=" + condition +
                ", ifBody=" + ifBody +
                ", elseBody=" + elseBody +
                '}';
    }
}
