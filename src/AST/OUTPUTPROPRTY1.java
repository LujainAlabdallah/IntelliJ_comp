package AST;

import java.util.List;

public class OUTPUTPROPRTY1 extends classMember {
    public List<String> name;
    public String innerType;

    public OUTPUTPROPRTY1(List<String> name, String innerType) {
        this.name = name;
        this.innerType = innerType;
    }

    @Override
    public String toString() {
        return "OutputProperty{" +
                "name=" + name +
                ", innerType='" + innerType + '\'' +
                '}';
    }
}
