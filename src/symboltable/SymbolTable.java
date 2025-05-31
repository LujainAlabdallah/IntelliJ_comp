package symboltable;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    private List<SymbolRow> table = new ArrayList<>();

    public void add(String name, String type) {
        table.add(new SymbolRow(name, type));
    }

    public void add(String name, String type, String value) {
        table.add(new SymbolRow(name, type, value));
    }

    public void print() {
        System.out.println("===== Symbol Table =====");
        System.out.println(String.format("%-15s | %-10s | %s", "Name", "Type", "Value"));
        System.out.println("-------------------------");
        for (SymbolRow row : table) {
            System.out.println(row);
        }
        System.out.println("=========================");
    }
}
