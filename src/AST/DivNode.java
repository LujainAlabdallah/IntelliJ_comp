package AST;

import java.util.List;

public class DivNode extends Element {
    private Attributes attributes;
    private List<ElementContent> contents;
    private boolean hasAttributes;

    // Constructor for div with attributes and content
    public DivNode(Attributes attributes, List<ElementContent> contents) {
        this.attributes = attributes;
        this.contents = contents;
        this.hasAttributes = true;
    }

    // Constructor for empty div (only '>')
    public DivNode() {
        this.hasAttributes = false;
    }

    public boolean hasAttributes() {
        return hasAttributes;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public List<ElementContent> getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return hasAttributes
                ? "DivNode(attributes=" + attributes + ", contents=" + contents + ")"
                : "DivNode(empty)";
    }
}
