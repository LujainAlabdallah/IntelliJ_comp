package AST;
public class StandaloneMetadata extends ComponentMetadata {
    public boolean standalone;

    public StandaloneMetadata(boolean standalone) {
        this.standalone = standalone;
    }

    @Override
    public String toString() {
        return "standalone: " + standalone;
    }
}