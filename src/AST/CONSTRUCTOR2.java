package AST;

import java.util.List;

public class CONSTRUCTOR2 extends classMember{
    public List<ConstructorParameter> parameters;
    public List<methodcall> methodCall2s;

    public CONSTRUCTOR2(List<ConstructorParameter> parameters, List<methodcall> methodCalls) {
        this.parameters = parameters;
        this.methodCall2s = methodCalls;
    }

    public CONSTRUCTOR2() {

    }
    public void addconstparameter(ConstructorParameter cp){
        this.parameters.add(cp);
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
