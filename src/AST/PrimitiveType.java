package AST;
public class PrimitiveType extends ComponentMetadata {
    public String value;

    public PrimitiveType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
