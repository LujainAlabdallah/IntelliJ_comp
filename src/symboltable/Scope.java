package symboltable;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private String scopeName;
    private Scope enclosingScope;
    private Map<String, Symbol> symbols = new HashMap<>();

    public Scope(String scopeName, Scope enclosingScope) {
        this.scopeName = scopeName;
        this.enclosingScope = enclosingScope;
    }

    public String getScopeName() {
        return scopeName;
    }

    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    public void define(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public Symbol resolve(String name) {
        Symbol s = symbols.get(name);
        if (s != null) return s;
        if (enclosingScope != null) return enclosingScope.resolve(name);
        return null;
    }

    public Map<String, Symbol> getSymbols() {
        return symbols;
    }
}
