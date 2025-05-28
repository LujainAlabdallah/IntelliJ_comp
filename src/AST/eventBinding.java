package AST;

import java.util.List;
import java.util.StringJoiner;

public class eventBinding extends Attribute {
    public List<String> identifiers;
    public String value;

    public eventBinding(List<String> identifiers, String value) {
        this.identifiers = identifiers;
        this.value = value;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(".");
        for (String id : identifiers) {
            joiner.add(id);
        }
        return "(" + joiner.toString() + ")=\"" + value + "\"";
    }
}
