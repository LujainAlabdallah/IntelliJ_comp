package AST;

public class StyleUrlMetadata extends ComponentMetadata {
    public StyleValue style;

    public StyleUrlMetadata(StyleValue style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "styleUrl: " + style.toString();
    }
}
//@Override
//public ComponentMetadata visitSTYLEURL(MyLangParser.STYLEURLContext ctx) {
//    StyleValue styleVal;
//    if (ctx.style().STRING() != null) {
//        String path = ctx.style().STRING().getText().replace("\"", "");
//        styleVal = new StyleString(path);
//    } else {
//        List<Rule> rules = new ArrayList<>();
//        for (MyLangParser.RuleContext ruleCtx : ctx.style().stylesheet().rule()) {
//            rules.add(visitRule(ruleCtx)); // يُفترض وجود visitRule
//        }
//        styleVal = new StyleSheetValue(rules);
//    }
//    return new StyleUrlMetadata(styleVal);
//}