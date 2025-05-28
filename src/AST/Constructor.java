package AST;

import java.util.List;

public class Constructor extends ProgramAll {
    public List<String> parameters;
    public List<methodcall> methodCall2s;

    public Constructor(List<String> parameters, List<methodcall> methodCalls) {
        this.parameters = parameters;
        this.methodCall2s = methodCalls;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public Constructor() {

    }

public  void addmethodcalls(methodcall mt){
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
