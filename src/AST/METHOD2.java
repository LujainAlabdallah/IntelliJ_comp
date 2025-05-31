package AST;

import java.util.List;

public class METHOD2 extends classMember {
    public List<String> name;
    public List<Statement> statements;

    public METHOD2(List<String> name, List<Statement> statements) {
        this.name = name;
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "Method{" +
                "name=" + name +
                ", statements=" + statements +
                '}';
    }
}