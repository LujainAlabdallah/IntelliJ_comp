package AST;

public class NumberFactor extends Factor {
    public String value;

    public NumberFactor(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}