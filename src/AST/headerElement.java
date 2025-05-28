package AST;

public class headerElement extends Element{
    public String interpolation;

    public headerElement(String interpolation) {
        this.interpolation = interpolation;
    }

    @Override
    public String toString() {
        return "<h1>{{" + interpolation + "}}</h1>";
    }
}
