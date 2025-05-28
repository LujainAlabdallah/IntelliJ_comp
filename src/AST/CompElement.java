package AST;

import java.util.List;

public class CompElement extends Element{
    private Attributes attributes;
    private boolean isSelfClosing;
    private List<String> identifiers;

    public CompElement(Attributes attributes) {
        this.attributes = attributes;
        this.isSelfClosing = false;
    }

    public CompElement(List<String> identifiers) {
        this.identifiers = identifiers;
        this.isSelfClosing = true;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public boolean isSelfClosing() {
        return isSelfClosing;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    @Override
    public String toString() {
        if (isSelfClosing) {
            return "CompElementNode(selfClosing, identifiers=" + identifiers + ")";
        } else {
            return "CompElementNode(withAttributes, attributes=" + attributes + ")";
        }
    }
}
