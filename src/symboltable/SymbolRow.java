package symboltable;

public class SymbolRow {
    private String name;
    private String type;
    private String value;

    public SymbolRow(String name, String type, String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public SymbolRow(String name, String type) {
        this(name, type, null);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return String.format("%-15s | %-10s | %s", name, type, value != null ? value : "—");
    }
}
