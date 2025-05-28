package AST;

public class buttonElement extends Element{
    public Attributes attributes;
    public String label;

    public buttonElement(Attributes attributes, String label) {
        this.attributes = attributes;
        this.label = label;
    }

    @Override
    public String toString() {
        return "<button" + attributes.toString() + ">" + label + "</button>";
    }
}
