package AST;

public class BUTTONELEMENT1 extends Element {
    public Attributes attributes;
    public String label;

    public BUTTONELEMENT1(Attributes attributes, String label) {
        this.attributes = attributes;
        this.label = label;
    }

    @Override
    public String toString() {
        return "<button" + attributes.toString() + ">" + label + "</button>";
    }
}

