package AST;

public class srcAttribute extends Attribute{
    public String value;

    public srcAttribute(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "src=\"" + value + "\"";
    }
}
