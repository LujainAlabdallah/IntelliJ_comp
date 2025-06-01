package SemanticError;

import symboltable.SymbolTable;

public class DuplicateChecker {
    SymbolTable symbolTable;
     SemanticErrorReporter reporter;

    public DuplicateChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public boolean check(String varName) {
        if (symbolTable.contains(varName)) {
            System.err.println("Semantic Error: Variable '" + varName + "' is already defined." );
            return true;
        }
        return false;
    }
}
