package AST;

public class paragraphElement extends Element {
    public Interpolation interpolation;

    public paragraphElement(Interpolation interpolation) {
        this.interpolation = interpolation;
    }

    public void setInterpolation(Interpolation interpolation) {
        this.interpolation = interpolation;
    }

    @Override
    public String toString() {
        return "<p>" + interpolation + "</p>";
    }
}
