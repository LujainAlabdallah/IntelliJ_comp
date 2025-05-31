//package AST;
//
//public class paragraphElement extends Element {
//    public Interpolation interpolation;
//
//    public paragraphElement(Interpolation interpolation) {
//        this.interpolation = interpolation;
//    }
//
//    public void setInterpolation(Interpolation interpolation) {
//        this.interpolation = interpolation;
//    }
//
//    @Override
//    public String toString() {
//        return "<p>" + interpolation + "</p>";
//    }
//}
package AST;

public class paragraphElement extends Element {
    public String interpolation;

    public paragraphElement(String interpolation) {
        this.interpolation = interpolation;
    }

    public void setInterpolation(String interpolation) {
        this.interpolation = interpolation;
    }

    @Override
    public String toString() {
        return "<p>{{" + interpolation + "}}</p>";
    }
}
