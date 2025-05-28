package AST;

import java.util.List;
import java.util.StringJoiner;

public class EVENTBINDING1 extends Attribute {
    public List<String> identifiers;
    public String value;

    public EVENTBINDING1(List<String> identifiers, String value) {
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
