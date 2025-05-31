package SemanticError;

public class SemanticError {
    private final String message;

    public SemanticError(String message) {
        this.message = message;

    }

    @Override
    public String toString() {
        return "SemanticError{" +
                "message='" + message + '\'' +
                '}';
    }
}
