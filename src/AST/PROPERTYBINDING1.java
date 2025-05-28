package AST;

import java.util.List;

public class PROPERTYBINDING1 extends Attribute {
    public List<String> property;
    public String value;

    public PROPERTYBINDING1(List<String> property, String value) {
        this.property = property;
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + property + "]=\"" + value + "\"";
    }
}
