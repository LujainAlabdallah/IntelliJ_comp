package AST;

import java.util.List;

public class service extends ProgramAll {
    public String name;
public List<String> identifier;

    public service(List<String> identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Service: " + identifier +name;
    }
}
