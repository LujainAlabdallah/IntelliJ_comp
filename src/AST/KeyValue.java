package AST;

public class KeyValue extends ProgramAll{
    String key;
    ProgramAll value;

    public KeyValue(String key, ProgramAll value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + " : " + value;
    }

}
