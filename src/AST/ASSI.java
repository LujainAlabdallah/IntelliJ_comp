package AST;

import java.util.List;

public class ASSI extends classMember{
    public List<String> target;
    public ExpressionCm value;
    List<AnyTypeCm> anytype;

    public ASSI(List<String> target, ExpressionCm value, List<AnyTypeCm> anytype) {
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
