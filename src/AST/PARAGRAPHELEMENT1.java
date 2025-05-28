package AST;
public class PARAGRAPHELEMENT1 extends Element {
    public Interpolation interpolation;

    public PARAGRAPHELEMENT1(Interpolation interpolation) {
        this.interpolation = interpolation;
    }

    @Override
    public String toString() {
        return "<p>" + interpolation + "</p>";
    }
}
