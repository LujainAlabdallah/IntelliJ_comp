//package AST;
//
//public class ANYTYPE2 extends Statement{
//    public enum Type {
//        LENGTH, COLOR, IDENTIFIER, NUMBER, STRING, ANY, ARRAY
//    }
//
//    private AnyType.Type type;
//    private Object value; // يمكن أن يكون String أو List<Product>
//
//    public ANYTYPE2(AnyType.Type type, Object value) {
//        this.type = type;
//        this.value = value;
//    }
//
//    public AnyType.Type getType() {
//        return type;
//    }
//
//    public Object getValue() {
//        return value;
//    }
//
//    @Override
//    public String toString() {
//        if (type == AnyType.Type.ARRAY) {
//            return value.toString(); // يفترض أن toString لـ List يعمل بشكل مناسب
//        }
//        return type.name() + ": " + value;
//    }
//}
