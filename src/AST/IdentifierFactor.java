package AST;

import java.util.List;

public class IdentifierFactor extends Factor {
    public List<String> identifiers;

    public IdentifierFactor(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public String toString() {
        return String.join(".", identifiers);
    }
}
