package AST;

public class IMAGEELEMENT1 extends Element {
    public Attributes attributes;

    public IMAGEELEMENT1(Attributes attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "<img" + attributes.toString() + " />";
    }
}
