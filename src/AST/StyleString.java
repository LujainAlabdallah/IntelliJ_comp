package AST;
public class StyleString extends StyleValue {
    public String value;

    public StyleString(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\"" + value + "\"";
    }
}

