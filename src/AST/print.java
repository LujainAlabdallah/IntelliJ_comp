package AST;

public class print extends ProgramAll {
    public String value;

    public print(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "print{" +
                "value='" + value + '\'' +
                '}';
    }
}
