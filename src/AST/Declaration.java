package AST;

import java.util.List;

public class Declaration extends ComponentMetadata {
    public List<String> property;
    public List<AnyType> value;

    public Declaration(List<String> property, List<AnyType> value) {
        this.property = property;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.join("-", property) + ": " + value.toString() + ";";
    }
}
