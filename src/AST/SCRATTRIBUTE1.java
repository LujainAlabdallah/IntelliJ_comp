package AST;
public class SCRATTRIBUTE1 extends Attribute {
    public String value;

    public SCRATTRIBUTE1(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "src=\"" + value + "\"";
    }
}


