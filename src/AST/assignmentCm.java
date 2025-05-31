package AST;

import java.util.List;

public class assignmentCm extends classMember{
    public List<String> target;
    public ExpressionCm value;
    List<AnyTypeCm> anytype;

    public assignmentCm(List<String> target, ExpressionCm value, List<AnyTypeCm> anytype) {
        this.target = target;
        this.value = value;
        this.anytype = anytype;
    }

    @Override
    public String toString() {
        return "ASSIGMENT{" +
                "target='" + target + '\'' +
                ", value=" + value +
                ", anyType=" + anytype +
                '}';
    }
}
