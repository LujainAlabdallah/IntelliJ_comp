package AST;

import java.util.List;

public class ExpressionSt extends Statement{
    public enum ExpressionType {
        TERM,
        ARITHMETIC,
        IDENTIFIER_CHAIN,
        PROPERTY_ACCESS_CHAIN,
        STRING_LITERAL,
        BOOLEAN_LITERAL,
        NULL_LITERAL
    }

    private ExpressionSt.ExpressionType type;

    // For TERM or Arithmetic
    private Term leftTerm;
    private List<String> operators; // PLUS, MINUS
    private List<Term> otherTerms;

    // For IDENTIFIER_CHAIN or PROPERTY_ACCESS_CHAIN
    private List<String> identifiers;
    private boolean hasLogicalNotPeriod;
    private String nullCoalescedValue;
    private ExpressionSt nullCoalescedExpr;

    // For Literals
    private String stringValue;
    private Boolean booleanValue;

    // Constructors for each type

    public ExpressionSt(Term term) {
        this.type = ExpressionSt.ExpressionType.TERM;
        this.leftTerm = term;
    }

    public ExpressionSt(Term left, List<String> ops, List<Term> others) {
        this.type = ExpressionSt.ExpressionType.ARITHMETIC;
        this.leftTerm = left;
        this.operators = ops;
        this.otherTerms = others;
    }

    public ExpressionSt(ExpressionSt.ExpressionType type, List<String> identifiers, boolean hasNotPeriod,
                      String nullCoalescedValue, ExpressionSt nullExpr) {
        this.type = type;
        this.identifiers = identifiers;
        this.hasLogicalNotPeriod = hasNotPeriod;
        this.nullCoalescedValue = nullCoalescedValue;
        this.nullCoalescedExpr = nullExpr;
    }

    public ExpressionSt(String value, boolean isString) {
        this.type = isString ? ExpressionSt.ExpressionType.STRING_LITERAL : ExpressionSt.ExpressionType.NULL_LITERAL;
        this.stringValue = value;
    }

    public ExpressionSt(Boolean boolVal) {
        this.type = ExpressionSt.ExpressionType.BOOLEAN_LITERAL;
        this.booleanValue = boolVal;
    }

    public ExpressionSt.ExpressionType getType() {
        return type;
    }

    public Term getLeftTerm() {
        return leftTerm;
    }

    public List<String> getOperators() {
        return operators;
    }

    public List<Term> getOtherTerms() {
        return otherTerms;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public boolean isHasLogicalNotPeriod() {
        return hasLogicalNotPeriod;
    }

    public String getNullCoalescedValue() {
        return nullCoalescedValue;
    }

    public ExpressionSt getNullCoalescedExpr() {
        return nullCoalescedExpr;
    }

    public String getStringValue() {
        return stringValue;
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    @Override
    public String toString() {
        return switch (type) {
            case TERM -> "ExpressionNode(TERM: " + leftTerm + ")";
            case ARITHMETIC -> "ExpressionNode(ARITHMETIC: " + leftTerm + " ops=" + operators + " terms=" + otherTerms + ")";
            case IDENTIFIER_CHAIN -> "ExpressionNode(ID_CHAIN: " + identifiers + ", ?? " + nullCoalescedValue + ")";
            case PROPERTY_ACCESS_CHAIN -> "ExpressionNode(ACCESS_CHAIN: " + identifiers + ", ?? " + nullCoalescedExpr + ")";
            case STRING_LITERAL -> "ExpressionNode(STRING: \"" + stringValue + "\")";
            case BOOLEAN_LITERAL -> "ExpressionNode(BOOLEAN: " + booleanValue + ")";
            case NULL_LITERAL -> "ExpressionNode(NULL)";
        };
    }
}
