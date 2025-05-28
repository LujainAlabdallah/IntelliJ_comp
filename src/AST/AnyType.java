//package AST;
//public abstract class AnyType extends ComponentMetadata {
//}
package AST;


public class AnyType extends ComponentMetadata{
    public enum Type {
        LENGTH, COLOR, IDENTIFIER, NUMBER, STRING, ANY, ARRAY
    }

    private Type type;
    private Object value; // يمكن أن يكون String أو List<Product>

    public AnyType(Type type, Object value) {
        this.type = type;
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (type == Type.ARRAY) {
            return value.toString(); // يفترض أن toString لـ List يعمل بشكل مناسب
        }
        return type.name() + ": " + value;
    }
}
