package AST;

public class PRINT2 extends Statement {
    public String value;

    public PRINT2(String value) {
        this.value = value;
    }

    public String toString() {
        return "print(" + value + ")";
    }
}
