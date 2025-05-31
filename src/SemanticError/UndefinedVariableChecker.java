package SemanticError;

import symboltable.SymbolTable;

public class UndefinedVariableChecker {
    SymbolTable symbolTable;

    public UndefinedVariableChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
    public boolean check(String varName) {
        if (!symbolTable.contains(varName)) {

            System.err.println("Semantic Error: Variable " + varName + " is used before being defined");
return true;
        }

        return false;
    }
}
