package AST;

import java.util.List;

public class assignment extends ProgramAll{
    public List<String> target;
    public Expression value;
    List<AnyType> anytype;

    public assignment(List<String> target, Expression value, List<AnyType> anytype) {
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
