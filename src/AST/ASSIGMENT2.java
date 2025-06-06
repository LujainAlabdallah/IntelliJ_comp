package AST;

import java.util.List;

public class ASSIGMENT2 extends Statement {
    public List<String> target;
    public ExpressionSt value;
    List<ANYTYPE2> anytype;

    public ASSIGMENT2(List<String> target, ExpressionSt value, List<ANYTYPE2> anytype) {
        this.target = target;
        this.value = value;
        this.anytype = anytype;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "target='" + target + '\'' +
                ", value=" + value +
                ", anyType=" + anytype +
                '}';
    }
}