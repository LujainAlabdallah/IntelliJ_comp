package AST;

public class ALTATTRIBUTE1 extends Attribute{
    public String value;

    public ALTATTRIBUTE1(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Alt=\"" + value + "\"";
    }
}
