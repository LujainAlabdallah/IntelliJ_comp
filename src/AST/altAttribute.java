package AST;

public class altAttribute extends Attribute{
    public String value;

    public altAttribute(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Alt=\"" + value + "\"";
    }
}
