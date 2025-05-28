package AST;

public class PRINT1 extends ProgramAll {
    public String value;

    public PRINT1(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PRINT1{" +
                "value='" + value + '\'' +
                '}';
    }
}
