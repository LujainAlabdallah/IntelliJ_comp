package SemanticError;

import AST.Element;
import org.antlr.v4.runtime.Token;
import symboltable.SymbolTable;

public class NgForSemanticChecker {
    SymbolTable symbolTable;
     SemanticErrorReporter reporter;
    public NgForSemanticChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void check(String expr) {
        String[] parts = expr.split(" ");
        if (!expr.contains("let")) {
            System.err.println("يجب أن تبدأ عبارة ngFor بـ 'let'. القيمة الحالية: " + expr);
        }

        if (!parts[2].equals("of")) {
            System.err.println("يجب أن تحتوي عبارة ngFor على الكلمة المحجوزة 'of'. القيمة الحالية: " + expr);
        }

        if (parts.length != 4 || !parts[2].equals("of")) {
           System.err.println("بنية ngFor غير صحيحة. الصيغة الصحيحة: let <item> of <collection>. القيمة الحالية: " + expr);

        }





    }
}