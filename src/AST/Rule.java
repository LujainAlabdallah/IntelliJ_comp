package AST;

import java.util.List;

public class Rule extends ComponentMetadata{
    public AST.selector selector;
    public List<Declaration> declarations;

    public Rule(AST.selector selector, List<Declaration> declarations) {
        this.selector = selector;
        this.declarations = declarations;
    }

    public AST.selector getSelector() {
        return selector;
    }

    public void setSelector(AST.selector selector) {
        this.selector = selector;
    }

    public List<Declaration> getDeclarations() {
        return declarations;
    }

    public void setDeclarations(List<Declaration> declarations) {
        this.declarations = declarations;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(selector.toString()).append(" {\n");
        for (Declaration decl : declarations) {
            sb.append("  ").append(decl.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}