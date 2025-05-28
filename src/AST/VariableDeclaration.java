package AST;

import java.util.List;

public class VariableDeclaration {
    public String type; // أو AnyType إن كانت محددة سابقًا
    public List<String> names;
    public String value;

    public VariableDeclaration(List<String> names, String type, String value) {
        this.names = names;
        this.type = type;
        this.value = value;
    }

}
