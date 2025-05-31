package AST;

import java.util.List;

public class CONSTRUCTOR2 extends classMember{
    public List<String> parameters;
    public List<methodcallCm> methodCall2s;

    public CONSTRUCTOR2(List<String> parameters, List<methodcallCm> methodCalls) {
        this.parameters = parameters;
        this.methodCall2s = methodCalls;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public List<methodcallCm> getMethodCall2s() {
        return methodCall2s;
    }

    public void setMethodCall2s(List<methodcallCm> methodCall2s) {
        this.methodCall2s = methodCall2s;
    }

    public CONSTRUCTOR2() {

    }

    public  void addmethodcalls(methodcallCm mt){
        this.methodCall2s.add(mt);
    }
    @Override
    public String toString() {
        return "Constructor{" +
                "parameters=" + parameters +
                ", methodCalls=" + methodCall2s +
                '}';
    }
}
