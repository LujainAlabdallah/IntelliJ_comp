package AST;

import java.util.List;

public class TermCm extends classMember{
    public Factor left;
    public List<String> operators; // MULTIPLY أو DIVIDE
    public List<Factor> rights;

    public TermCm(Factor left, List<String> operators, List<Factor> rights) {
        this.left = left;
        this.operators = operators;
        this.rights = rights;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(left.toString());
        for (int i = 0; i < operators.size(); i++) {
            sb.append(" ").append(operators.get(i)).append(" ").append(rights.get(i).toString());
        }
        return sb.toString();
    }
}
