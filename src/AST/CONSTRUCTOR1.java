package AST;

import java.util.List;

public class CONSTRUCTOR1 extends ProgramAll {
    public List<ConstructorParameter> parameters;
    public List<methodcall> methodCalls;

    public CONSTRUCTOR1(List<ConstructorParameter> parameters,List<methodcall> methodCalls) {
        this.parameters = parameters;
        this.methodCalls = methodCalls;
    }

    @Override
    public String toString() {
        return "CONSTRUCTOR1{" +
                "parameters=" + parameters +
                ", methodCalls=" + methodCalls +
                '}';
    }
}
