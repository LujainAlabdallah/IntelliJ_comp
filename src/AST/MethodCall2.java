package AST;

import java.util.List;

public class MethodCall2 extends Statement {
    public String objectName;
    public String methodName;
    public List<ExpressionSt> arguments;
    public List<ANYTYPE2> anytype;

    public MethodCall2(String objectName, String methodName, List<ExpressionSt> arguments, List<ANYTYPE2> anytype) {
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