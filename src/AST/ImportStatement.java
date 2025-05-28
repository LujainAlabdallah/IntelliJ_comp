package AST;

public class ImportStatement extends ProgramAll {
    public String module;

    public ImportStatement(String module) {
        this.module = module;
    }

    @Override
    public String toString() {
        return "import " + module;
    }
}
