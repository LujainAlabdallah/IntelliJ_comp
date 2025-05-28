package AST;

import java.beans.Statement;
import java.util.List;

public class FunctionDefinition {
    public List<String> name;
    public List<FunctionParameter> parameters;
    public List<Statement> body;

    public FunctionDefinition(List<String> name, List<FunctionParameter> parameters, List<Statement> body) {
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }
}
