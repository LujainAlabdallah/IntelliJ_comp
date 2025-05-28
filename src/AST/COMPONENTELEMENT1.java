package AST;

import java.util.List;

public class COMPONENTELEMENT1 extends Element {
    public enum ComponentType {
        CUSTOM_COMPONENT,
        NGFOR_DIV
    }

    private ComponentType type;
    private List<String> identifiers;
    private CompElement compElement;

    private String ngForExpression;
    private ElementContent elementContent;

    public COMPONENTELEMENT1(List<String> identifiers, CompElement compElement) {
        this.type = ComponentType.CUSTOM_COMPONENT;
        this.identifiers = identifiers;
        this.compElement = compElement;
    }
    public COMPONENTELEMENT1(String ngForExpression, ElementContent elementContent) {
        this.type = ComponentType.NGFOR_DIV;
        this.ngForExpression = ngForExpression;
        this.elementContent = elementContent;
    }
    public ComponentType getType() {
        return type;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public CompElement getCompElement() {
        return compElement;
    }

    public String getNgForExpression() {
        return ngForExpression;
    }

    public ElementContent getElementContent() {
        return elementContent;
    }

    @Override
    public String toString() {
        return switch (type) {
            case CUSTOM_COMPONENT -> "ComponentElementNode(CUSTOM, identifiers=" + identifiers + ", comp=" + compElement + ")";
            case NGFOR_DIV -> "ComponentElementNode(NGFOR_DIV, ngFor=\"" + ngForExpression + "\", content=" + elementContent + ")";
        };
    }
}
