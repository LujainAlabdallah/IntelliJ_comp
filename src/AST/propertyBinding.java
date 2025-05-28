package AST;

import java.util.List;

public class propertyBinding extends Attribute{
    public List<String> property;
    public String value;

    public propertyBinding(List<String> property, String value) {
        this.property = property;
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + property + "]=\"" + value + "\"";
    }
}
