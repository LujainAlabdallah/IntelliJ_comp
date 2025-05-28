package AST;

import java.util.List;

public class selector extends ComponentMetadata  {
    public List<String> identifiers;

    public selector(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public String toString() {
        return String.join(", ", identifiers);
    }
}

