package AST;

public class clickAttribute extends Attribute{
    public String handler;

    public clickAttribute(String handler) {
        this.handler = handler;
    }

    @Override
    public String toString() {
        return "(click)=\"" + handler + "\"";
    }
}
