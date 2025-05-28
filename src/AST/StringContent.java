package AST;
public class StringContent extends ElementContent {
    public String text;

    public StringContent(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}


