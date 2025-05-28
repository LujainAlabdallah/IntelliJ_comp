package AST;

public class ElementContentNode extends ElementContent {
    public enum ContentType {
        IDENTIFIER,
        STRING,
        INTERPOLATION
    }

    private ContentType type;
    private String value;
    private Interpolation interpolation;

    // Constructor for IDENTIFIER or STRING
    public ElementContentNode(ContentType type, String value) {
        this.type = type;
        this.value = value;
    }

    // Constructor for INTERPOLATION
    public ElementContentNode(Interpolation interpolation) {
        this.type = ContentType.INTERPOLATION;
        this.interpolation = interpolation;
    }

    public ContentType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public Interpolation getInterpolation() {
        return interpolation;
    }

    @Override
    public String toString() {
        return switch (type) {
            case IDENTIFIER, STRING -> "ElementContentNode(" + type + ", value=" + value + ")";
            case INTERPOLATION -> "ElementContentNode(INTERPOLATION, " + interpolation + ")";
        };
    }
}
