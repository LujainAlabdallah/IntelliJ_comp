package AST;

import java.util.List;

public class ASSIGMENT2 extends Statement {
    public List<String> target;
    public Expression value;
    List<AnyType> anytype;

    public ASSIGMENT2(List<String> target, Expression value, List<AnyType> anytype) {
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