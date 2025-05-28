package AST;

public class HEADERELEMENT1 extends Element {
    public String interpolation;

    public HEADERELEMENT1(String interpolation) {
        this.interpolation = interpolation;
    }

    @Override
    public String toString() {
        return "<h1>{{" + interpolation + "}}</h1>";
    }
}
