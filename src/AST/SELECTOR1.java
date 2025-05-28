package AST;
public class SELECTOR1 extends ComponentMetadata {
    public String selector;

    public SELECTOR1(String selector) {
        this.selector = selector;
    }

    @Override
    public String toString() {
        return "selector: \"" + selector + "\"";
    }
}