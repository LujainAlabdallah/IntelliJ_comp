package AST;

import java.util.List;

public class Product extends ProgramAll{
    public List<String> firstKey;    // IDENTIFIER*
    public String firstValue;        // NUMBER*
    public List<String> secondKey;   // IDENTIFIER*
    public String secondValue;       // STRING
    public List<String> thirdKey;    // IDENTIFIER*
    public String thirdValue;        // STRING

    public Product(List<String> firstKey, String firstValue, List<String> secondKey, String secondValue, List<String> thirdKey, String thirdValue) {
        this.firstKey = firstKey;
        this.firstValue = firstValue;
        this.secondKey = secondKey;
        this.secondValue = secondValue;
        this.thirdKey = thirdKey;
        this.thirdValue = thirdValue;
    }

    @Override
    public String toString() {
        return "{" + String.join(" ", firstKey) + ": " + firstValue + ", "
                + String.join(" ", secondKey) + ": \"" + secondValue + "\", "
                + String.join(" ", thirdKey) + ": \"" + thirdValue + "\"}";
    }
}
