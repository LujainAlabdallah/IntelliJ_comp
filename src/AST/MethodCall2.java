package AST;

import java.util.List;

public class MethodCall2 extends Statement {
    public String objectName;
    public String methodName;
    public List<Expression> arguments;
    public List<AnyType> anytype;

    public MethodCall2(String objectName, String methodName, List<Expression> arguments, List<AnyType> anytype) {
        this.objectName = objectName;
        this.methodName = methodName;
        this.arguments = arguments;
        this.anytype = anytype;
    }

    @Override
    public String toString() {
        return "MethodCall{" +
                "objectName='" + objectName + '\'' +
                ", methodName='" + methodName + '\'' +
                ", arguments=" + arguments +
                ", anyType=" + anytype +
                '}';
    }
}