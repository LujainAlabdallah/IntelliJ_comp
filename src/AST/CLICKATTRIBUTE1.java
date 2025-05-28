package AST;
public class CLICKATTRIBUTE1 extends Attribute {
    public String handler;

    public CLICKATTRIBUTE1(String handler) {
        this.handler = handler;
    }

    @Override
    public String toString() {
        return "(click)=\"" + handler + "\"";
    }
}
