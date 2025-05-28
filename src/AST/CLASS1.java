package AST;

import java.util.ArrayList;
import java.util.List;

public class CLASS1 extends ProgramAll{
    public List<String> name;
    public List<classMember> classMemberList;

    public CLASS1(List<String> name, List<classMember> classMemberList) {
        this.name = name;
        this.classMemberList = classMemberList;
    }

    public void setClassMemberList(List<classMember> classMemberList) {
        this.classMemberList = classMemberList;
    }

    @Override
    public String toString() {
        return "ClassNode{" +
                "name=" + name +
                ", classMemberList=" + classMemberList +
                '}';
    }
}
