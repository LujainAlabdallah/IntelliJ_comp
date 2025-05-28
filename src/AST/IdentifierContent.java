package AST;
public class IdentifierContent extends ElementContent {
    public String name;

    public IdentifierContent(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
