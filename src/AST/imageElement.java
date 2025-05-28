package AST;

public class imageElement extends Element {
    public Attributes attributes;

    public imageElement(Attributes attributes) {
        this.attributes = attributes;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "<img" + attributes.toString() + " />";
    }
}
