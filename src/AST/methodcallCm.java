package AST;

import java.util.List;

public class methodcallCm extends classMember{
    public String objectName;
    public String methodName;
    public List<ExpressionCm> arguments;
    public List<AnyType1> anytype;

    public methodcallCm(String objectName, String methodName, List<ExpressionCm> arguments,List<AnyType1> anytype) {
        this.objectName = objectName;
        this.methodName = methodName;
        this.arguments = arguments;
        this.anytype = anytype;
    }

    @Override
    public String toString() {
        return "METHODCALL1{" +
                "objectName='" + objectName + '\'' +
                ", methodName='" + methodName + '\'' +
                ", arguments=" + arguments +
                ", anyType=" + anytype +
                '}';
    }
}
