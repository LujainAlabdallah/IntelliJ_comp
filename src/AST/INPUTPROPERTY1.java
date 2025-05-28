package AST;

import java.util.List;

public class INPUTPROPERTY1 extends classMember {
    public boolean required;
    public List<String> name;

    public INPUTPROPERTY1(boolean required, List<String> name) {
        this.required = required;
        this.name = name;
    }

    @Override
    public String toString() {
        return "InputProperty{" +
                "required"+
                "bool=" + required +
                ", name=" + name +
                '}';
    }
}