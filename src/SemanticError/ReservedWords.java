package SemanticError;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReservedWords {

    private  final Set<String> reservedWords = new HashSet<>(Arrays.asList(
            "if", "else", "for", "while", "return", "var", "let", "const", "function", "class", "import", "export",
            "default", "new", "try", "catch", "finally", "break", "continue", "switch", "case", "throw", "extends",
            "super", "this", "void", "static", "public", "private", "protected", "yield", "async", "await", "null",
            "true", "false"
    ));

    public  boolean isReserved(String word) {
        if(reservedWords.contains(word)){
            System.err.println("Semantic Error: Cannot use reserved word as variable name: '" + word + "'");
            return true;
        }
        return false;
    }
}
