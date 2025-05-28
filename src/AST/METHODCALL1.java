package AST;

import java.util.List;

public class METHODCALL1 extends ProgramAll {
    public String objectName;
    public String methodName;
    public List<Expression> arguments;
    public List<AnyType> anytype;

    public METHODCALL1(String objectName, String methodName, List<Expression> arguments,List<AnyType> anytype) {
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
