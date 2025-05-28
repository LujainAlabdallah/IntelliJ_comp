package AST;
import java.util.List;

public class Attributes extends Element{
    public List<Attribute> attributes;

    public Attributes() {
    }

    public Attributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Attribute attr : attributes) {
            sb.append(" ").append(attr.toString());
        }
        return sb.toString();
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}
