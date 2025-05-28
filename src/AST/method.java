package AST;


import java.util.List;

public class method extends ProgramAll{
    public List<String> name;
    public List<Statement> statements;

    public method(List<String> name, List<Statement> statements) {
        this.name = name;
        this.statements = statements;
    }

    public method() {
    }

    public void setStatements(List<Statement> statements) {
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
