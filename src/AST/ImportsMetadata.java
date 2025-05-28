package AST;

import java.util.List;

public class ImportsMetadata extends ComponentMetadata {
    public List<String> imports;

    public ImportsMetadata(List<String> imports) {
        this.imports = imports;
    }

    @Override
    public String toString() {
        return "imports: " + imports.toString();
    }
}
