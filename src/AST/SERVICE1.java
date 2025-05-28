package AST;

import java.util.List;

public class SERVICE1 {
    public String name;
    public List<String> identifier;

    public SERVICE1(List<String> identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Service: " + identifier +name;
    }
}
