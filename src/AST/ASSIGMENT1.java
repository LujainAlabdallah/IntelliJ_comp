package AST;

import java.util.List;

public class ASSIGMENT1 extends ProgramAll {
    public String target;
    public Expression value;
    List<AnyType> anytype;

    public ASSIGMENT1(String target, Expression value, List<AnyType> anytype) {
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
