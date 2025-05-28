package AST;

public class BooleanFactor extends Factor {
    public String value;

    public BooleanFactor(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
