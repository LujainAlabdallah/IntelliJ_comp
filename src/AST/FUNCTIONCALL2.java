package AST;

import java.util.List;

public class FUNCTIONCALL2 extends Statement {
    public String functionName;
    public List<Expression> arguments;
    public AnyType anytype;

    public FUNCTIONCALL2(String functionName, List<Expression> arguments, AnyType anytype) {
        this.functionName = functionName;
        this.arguments = arguments;
        this.anytype = anytype;
    }

    @Override
    public String toString() {
        return "FunctionCall{" +
                "functionName='" + functionName + '\'' +
                ", arguments=" + arguments +
                ", anyType=" + anytype +
                '}';
    }
}

