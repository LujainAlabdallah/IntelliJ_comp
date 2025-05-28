package AST;

import java.util.List;

public class componentElement extends Element {
    public enum ComponentType {
        CUSTOM_COMPONENT,
        NGFOR_DIV
    }

    private COMPONENTELEMENT1.ComponentType type;
    private List<String> identifiers;
    private CompElement compElement;

    private String ngForExpression;
    private ElementContent elementContent;

    public componentElement(List<String> identifiers, CompElement compElement) {
        this.type = COMPONENTELEMENT1.ComponentType.CUSTOM_COMPONENT;
        this.identifiers = identifiers;
        this.compElement = compElement;
    }
    public componentElement(String ngForExpression, ElementContent elementContent) {
        this.type = COMPONENTELEMENT1.ComponentType.NGFOR_DIV;
        this.ngForExpression = ngForExpression;
        this.elementContent = elementContent;
    }
    public COMPONENTELEMENT1.ComponentType getType() {
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
