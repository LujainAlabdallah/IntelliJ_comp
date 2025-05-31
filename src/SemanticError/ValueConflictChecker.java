package SemanticError;

import symboltable.SymbolTable;

public class ValueConflictChecker {
    SymbolTable symbolTable;

    public ValueConflictChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public boolean check(String varName, String newValue) {
        if (symbolTable.contains(varName)) {
            String existingValue = symbolTable.get(varName).getValue();
            if (existingValue != null && !existingValue.equals(newValue)) {
                System.err.println("Semantic Error: Conflicting assignment to variable '" + varName +
                        "'. Existing value: " + existingValue + ", New value: " + newValue);
                return true;
            }
        }
        return false;
    }
}
