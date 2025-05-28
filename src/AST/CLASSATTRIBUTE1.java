package AST;
public class CLASSATTRIBUTE1 extends Attribute {
    public String value;

    public CLASSATTRIBUTE1(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "class=\"" + value + "\"";
    }
}
