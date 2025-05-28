package AST;
import java.util.List;

public class DIVELEMENT1 extends Element {
    private DivNode div;
    private List<ProgramAll> innerElements; // Could be other HTML elements

    public DIVELEMENT1(DivNode div, List<ProgramAll> innerElements) {
        this.div = div;
        this.innerElements = innerElements;
    }

    public DivNode getDiv() {
        return div;
    }

    public List<ProgramAll> getInnerElements() {
        return innerElements;
    }

    @Override
    public String toString() {
        return "DivElementNode(div=" + div + ", children=" + innerElements + ")";
    }

}
