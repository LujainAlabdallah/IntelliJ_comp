package AST;

public class classAttribute extends Attribute{
    public String value;

    public classAttribute(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "class=\"" + value + "\"";
    }
}
