package AST;

import java.util.List;

public class FUNCTIONCALL1 extends ProgramAll{
    public String functionName;
    public List<Expression> arguments;
    public AnyType anytype;

    public FUNCTIONCALL1(String functionName, List<Expression> arguments, AnyType anytype) {
        this.functionName = functionName;
        this.arguments = arguments;
        this.anytype = anytype;
    }

    @Override
    public String toString() {
        return "FUNCTIONCALL{" +
                "functionName='" + functionName + '\'' +
                ", arguments=" + arguments +
                ", anyType=" + anytype +
                '}';
    }
}
