package AST;

public class AnyTypeCm extends classMember{
    public enum Type {
        LENGTH, COLOR, IDENTIFIER, NUMBER, STRING, ANY, ARRAY
    }

    private AnyTypeCm.Type type;
    private Object value; // يمكن أن يكون String أو List<Product>

    public AnyTypeCm(AnyTypeCm.Type type, Object value) {
        this.type = type;
        this.value = value;
    }

    public AnyTypeCm.Type getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (type == AnyTypeCm.Type.ARRAY) {
            return value.toString(); // يفترض أن toString لـ List يعمل بشكل مناسب
        }
        return type.name() + ": " + value;
    }
}
