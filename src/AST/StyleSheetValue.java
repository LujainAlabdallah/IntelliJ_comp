package AST;

import java.util.List;

public class StyleSheetValue extends StyleValue {
    public List<Rule> rules;

    public StyleSheetValue(List<Rule> rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Rule rule : rules) {
            sb.append(rule.toString()).append("\n");
        }
        return sb.toString();
    }
}
