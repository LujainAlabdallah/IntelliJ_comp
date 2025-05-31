package SemanticError;

import java.util.ArrayList;
import java.util.List;

public class SemanticErrorReporter {
    private final List<SemanticError> errors = new ArrayList<>();

    public void report(String message) {
        errors.add(new SemanticError(message));
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public void printErrors() {
        for (SemanticError error : errors) {
            System.err.println(error);
        }
    }

    public List<SemanticError> getErrors() {
        return errors;
    }
}
