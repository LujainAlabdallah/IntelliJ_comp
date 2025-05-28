package AST;

public class STYLEATTRIBUTE1 extends Attribute{
    public String value;

    public STYLEATTRIBUTE1(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Style=\"" + value + "\"";
    }
}
