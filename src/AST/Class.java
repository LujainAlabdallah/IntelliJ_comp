package AST;


import java.util.List;

public class Class extends ProgramAll {
    public List<String> name;
    public List<classMember> classMemberList;

    public Class(List<String> name, List<classMember> classMemberList) {
        this.name = name;
        this.classMemberList = classMemberList;
    }

    public Class() {
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
