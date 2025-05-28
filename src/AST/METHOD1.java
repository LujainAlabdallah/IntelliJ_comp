package AST;

import java.util.List;

public class METHOD1 extends ProgramAll{
    public List<String> name;
    public List<Statement> statements;

    public METHOD1(List<String> name,List<Statement> statements) {
        this.name = name;
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "METHOD{" +
                "name=" + name +
                ", statements=" + statements +
                '}';
    }
}
