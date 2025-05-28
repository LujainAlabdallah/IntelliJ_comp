package AST;

public class styleAttribute extends Attribute {
    public String value;

    public styleAttribute(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Style=\"" + value + "\"";
    }
}
