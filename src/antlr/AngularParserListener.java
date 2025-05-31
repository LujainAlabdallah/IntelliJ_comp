// Generated from C:/Users/muzaic/Desktop/comp/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatements}.
	 * @param ctx the parse tree
	 */
	void enterImportStatements(AngularParser.ImportStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatements}.
	 * @param ctx the parse tree
	 */
	void exitImportStatements(AngularParser.ImportStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#service}.
	 * @param ctx the parse tree
	 */
	void enterService(AngularParser.ServiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#service}.
	 * @param ctx the parse tree
	 */
	void exitService(AngularParser.ServiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SELECTOR1}
	 * labeled alternative in {@link AngularParser#component_metadata}.
	 * @param ctx the parse tree
	 */
	void enterSELECTOR1(AngularParser.SELECTOR1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code SELECTOR1}
	 * labeled alternative in {@link AngularParser#component_metadata}.
	 * @param ctx the parse tree
	 */
	void exitSELECTOR1(AngularParser.SELECTOR1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code STANDLONE}
	 * labeled alternative in {@link AngularParser#component_metadata}.
	 * @param ctx the parse tree
	 */
	void enterSTANDLONE(AngularParser.STANDLONEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STANDLONE}
	 * labeled alternative in {@link AngularParser#component_metadata}.
	 * @param ctx the parse tree
	 */
	void exitSTANDLONE(AngularParser.STANDLONEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IMPORTS}
	 * labeled alternative in {@link AngularParser#component_metadata}.
	 * @param ctx the parse tree
	 */
	void enterIMPORTS(AngularParser.IMPORTSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IMPORTS}
	 * labeled alternative in {@link AngularParser#component_metadata}.
	 * @param ctx the parse tree
	 */
	void exitIMPORTS(AngularParser.IMPORTSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TEMPLATEURL}
	 * labeled alternative in {@link AngularParser#component_metadata}.
	 * @param ctx the parse tree
	 */
	void enterTEMPLATEURL(AngularParser.TEMPLATEURLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TEMPLATEURL}
	 * labeled alternative in {@link AngularParser#component_metadata}.
	 * @param ctx the parse tree
	 */
	void exitTEMPLATEURL(AngularParser.TEMPLATEURLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STYLEURL}
	 * labeled alternative in {@link AngularParser#component_metadata}.
	 * @param ctx the parse tree
	 */
	void enterSTYLEURL(AngularParser.STYLEURLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STYLEURL}
	 * labeled alternative in {@link AngularParser#component_metadata}.
	 * @param ctx the parse tree
	 */
	void exitSTYLEURL(AngularParser.STYLEURLContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(AngularParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(AngularParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(AngularParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(AngularParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SERVICE1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void enterSERVICE1(AngularParser.SERVICE1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code SERVICE1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void exitSERVICE1(AngularParser.SERVICE1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code CLASS1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void enterCLASS1(AngularParser.CLASS1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code CLASS1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void exitCLASS1(AngularParser.CLASS1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code COMPONENTDECLARATION1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void enterCOMPONENTDECLARATION1(AngularParser.COMPONENTDECLARATION1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code COMPONENTDECLARATION1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void exitCOMPONENTDECLARATION1(AngularParser.COMPONENTDECLARATION1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code IMPORTSTATEMENT1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void enterIMPORTSTATEMENT1(AngularParser.IMPORTSTATEMENT1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code IMPORTSTATEMENT1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void exitIMPORTSTATEMENT1(AngularParser.IMPORTSTATEMENT1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ASSIGMENT1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void enterASSIGMENT1(AngularParser.ASSIGMENT1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ASSIGMENT1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void exitASSIGMENT1(AngularParser.ASSIGMENT1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCTIONCALL1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void enterFUNCTIONCALL1(AngularParser.FUNCTIONCALL1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCTIONCALL1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void exitFUNCTIONCALL1(AngularParser.FUNCTIONCALL1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code METHODCALL1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void enterMETHODCALL1(AngularParser.METHODCALL1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code METHODCALL1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void exitMETHODCALL1(AngularParser.METHODCALL1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LOOPSTATEMENT1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void enterLOOPSTATEMENT1(AngularParser.LOOPSTATEMENT1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LOOPSTATEMENT1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void exitLOOPSTATEMENT1(AngularParser.LOOPSTATEMENT1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code RETURNSTATEMENT1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void enterRETURNSTATEMENT1(AngularParser.RETURNSTATEMENT1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code RETURNSTATEMENT1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void exitRETURNSTATEMENT1(AngularParser.RETURNSTATEMENT1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PRINT1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void enterPRINT1(AngularParser.PRINT1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PRINT1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void exitPRINT1(AngularParser.PRINT1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code CONSTRUCTOR1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void enterCONSTRUCTOR1(AngularParser.CONSTRUCTOR1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code CONSTRUCTOR1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void exitCONSTRUCTOR1(AngularParser.CONSTRUCTOR1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code METHOD1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void enterMETHOD1(AngularParser.METHOD1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code METHOD1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void exitMETHOD1(AngularParser.METHOD1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyType1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void enterAnyType1(AngularParser.AnyType1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyType1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void exitAnyType1(AngularParser.AnyType1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code VIF1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void enterVIF1(AngularParser.VIF1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code VIF1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 */
	void exitVIF1(AngularParser.VIF1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#vif}.
	 * @param ctx the parse tree
	 */
	void enterVif(AngularParser.VifContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#vif}.
	 * @param ctx the parse tree
	 */
	void exitVif(AngularParser.VifContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(AngularParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(AngularParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DIVELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterDIVELEMENT1(AngularParser.DIVELEMENT1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code DIVELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitDIVELEMENT1(AngularParser.DIVELEMENT1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code HEADERELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterHEADERELEMENT1(AngularParser.HEADERELEMENT1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code HEADERELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitHEADERELEMENT1(AngularParser.HEADERELEMENT1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code COMPONENTELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterCOMPONENTELEMENT1(AngularParser.COMPONENTELEMENT1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code COMPONENTELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitCOMPONENTELEMENT1(AngularParser.COMPONENTELEMENT1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code IMAGEELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterIMAGEELEMENT1(AngularParser.IMAGEELEMENT1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code IMAGEELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitIMAGEELEMENT1(AngularParser.IMAGEELEMENT1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BUTTONELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterBUTTONELEMENT1(AngularParser.BUTTONELEMENT1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BUTTONELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitBUTTONELEMENT1(AngularParser.BUTTONELEMENT1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PARAGRAPHELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterPARAGRAPHELEMENT1(AngularParser.PARAGRAPHELEMENT1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PARAGRAPHELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitPARAGRAPHELEMENT1(AngularParser.PARAGRAPHELEMENT1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code NGFORELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterNGFORELEMENT1(AngularParser.NGFORELEMENT1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code NGFORELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitNGFORELEMENT1(AngularParser.NGFORELEMENT1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#divElement}.
	 * @param ctx the parse tree
	 */
	void enterDivElement(AngularParser.DivElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#divElement}.
	 * @param ctx the parse tree
	 */
	void exitDivElement(AngularParser.DivElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(AngularParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(AngularParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#headerElement}.
	 * @param ctx the parse tree
	 */
	void enterHeaderElement(AngularParser.HeaderElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#headerElement}.
	 * @param ctx the parse tree
	 */
	void exitHeaderElement(AngularParser.HeaderElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#imageElement}.
	 * @param ctx the parse tree
	 */
	void enterImageElement(AngularParser.ImageElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#imageElement}.
	 * @param ctx the parse tree
	 */
	void exitImageElement(AngularParser.ImageElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(AngularParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(AngularParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#buttonElement}.
	 * @param ctx the parse tree
	 */
	void enterButtonElement(AngularParser.ButtonElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#buttonElement}.
	 * @param ctx the parse tree
	 */
	void exitButtonElement(AngularParser.ButtonElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#button}.
	 * @param ctx the parse tree
	 */
	void enterButton(AngularParser.ButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#button}.
	 * @param ctx the parse tree
	 */
	void exitButton(AngularParser.ButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#paragraphElement}.
	 * @param ctx the parse tree
	 */
	void enterParagraphElement(AngularParser.ParagraphElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#paragraphElement}.
	 * @param ctx the parse tree
	 */
	void exitParagraphElement(AngularParser.ParagraphElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngForElement}.
	 * @param ctx the parse tree
	 */
	void enterNgForElement(AngularParser.NgForElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngForElement}.
	 * @param ctx the parse tree
	 */
	void exitNgForElement(AngularParser.NgForElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentElement}.
	 * @param ctx the parse tree
	 */
	void enterComponentElement(AngularParser.ComponentElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentElement}.
	 * @param ctx the parse tree
	 */
	void exitComponentElement(AngularParser.ComponentElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#compElement}.
	 * @param ctx the parse tree
	 */
	void enterCompElement(AngularParser.CompElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#compElement}.
	 * @param ctx the parse tree
	 */
	void exitCompElement(AngularParser.CompElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENTIFIER1}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 */
	void enterIDENTIFIER1(AngularParser.IDENTIFIER1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENTIFIER1}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 */
	void exitIDENTIFIER1(AngularParser.IDENTIFIER1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 */
	void enterSTRING(AngularParser.STRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 */
	void exitSTRING(AngularParser.STRINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INTERPOLATION1}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 */
	void enterINTERPOLATION1(AngularParser.INTERPOLATION1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code INTERPOLATION1}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 */
	void exitINTERPOLATION1(AngularParser.INTERPOLATION1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(AngularParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(AngularParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CLASSATTRIBUTE1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterCLASSATTRIBUTE1(AngularParser.CLASSATTRIBUTE1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code CLASSATTRIBUTE1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitCLASSATTRIBUTE1(AngularParser.CLASSATTRIBUTE1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code SCRATTRIBUTE1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterSCRATTRIBUTE1(AngularParser.SCRATTRIBUTE1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code SCRATTRIBUTE1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitSCRATTRIBUTE1(AngularParser.SCRATTRIBUTE1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ALTATTRIBUTE1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterALTATTRIBUTE1(AngularParser.ALTATTRIBUTE1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ALTATTRIBUTE1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitALTATTRIBUTE1(AngularParser.ALTATTRIBUTE1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code STYLEATTRIBUTE1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterSTYLEATTRIBUTE1(AngularParser.STYLEATTRIBUTE1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code STYLEATTRIBUTE1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitSTYLEATTRIBUTE1(AngularParser.STYLEATTRIBUTE1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code CLICKATTRIBUTE1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterCLICKATTRIBUTE1(AngularParser.CLICKATTRIBUTE1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code CLICKATTRIBUTE1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitCLICKATTRIBUTE1(AngularParser.CLICKATTRIBUTE1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PROPERTYBINDING1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterPROPERTYBINDING1(AngularParser.PROPERTYBINDING1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PROPERTYBINDING1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitPROPERTYBINDING1(AngularParser.PROPERTYBINDING1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code EVENTBINDING1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterEVENTBINDING1(AngularParser.EVENTBINDING1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code EVENTBINDING1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitEVENTBINDING1(AngularParser.EVENTBINDING1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classAttribute}.
	 * @param ctx the parse tree
	 */
	void enterClassAttribute(AngularParser.ClassAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classAttribute}.
	 * @param ctx the parse tree
	 */
	void exitClassAttribute(AngularParser.ClassAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#srcAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSrcAttribute(AngularParser.SrcAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#srcAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSrcAttribute(AngularParser.SrcAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#altAttribute}.
	 * @param ctx the parse tree
	 */
	void enterAltAttribute(AngularParser.AltAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#altAttribute}.
	 * @param ctx the parse tree
	 */
	void exitAltAttribute(AngularParser.AltAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttribute(AngularParser.StyleAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttribute(AngularParser.StyleAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#clickAttribute}.
	 * @param ctx the parse tree
	 */
	void enterClickAttribute(AngularParser.ClickAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#clickAttribute}.
	 * @param ctx the parse tree
	 */
	void exitClickAttribute(AngularParser.ClickAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(AngularParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(AngularParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(AngularParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(AngularParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(AngularParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(AngularParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(AngularParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(AngularParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classmem}.
	 * @param ctx the parse tree
	 */
	void enterClassmem(AngularParser.ClassmemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classmem}.
	 * @param ctx the parse tree
	 */
	void exitClassmem(AngularParser.ClassmemContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(AngularParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(AngularParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INPUTPROPERTY1}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterINPUTPROPERTY1(AngularParser.INPUTPROPERTY1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code INPUTPROPERTY1}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitINPUTPROPERTY1(AngularParser.INPUTPROPERTY1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code OUTPUTPROPRTY1}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterOUTPUTPROPRTY1(AngularParser.OUTPUTPROPRTY1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code OUTPUTPROPRTY1}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitOUTPUTPROPRTY1(AngularParser.OUTPUTPROPRTY1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code METHOD2}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterMETHOD2(AngularParser.METHOD2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code METHOD2}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitMETHOD2(AngularParser.METHOD2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LOOPSTATEMENT2}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterLOOPSTATEMENT2(AngularParser.LOOPSTATEMENT2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LOOPSTATEMENT2}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitLOOPSTATEMENT2(AngularParser.LOOPSTATEMENT2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code VIF2}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterVIF2(AngularParser.VIF2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code VIF2}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitVIF2(AngularParser.VIF2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code CONSTRUCTOR2}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterCONSTRUCTOR2(AngularParser.CONSTRUCTOR2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code CONSTRUCTOR2}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitCONSTRUCTOR2(AngularParser.CONSTRUCTOR2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ASSI}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterASSI(AngularParser.ASSIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASSI}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitASSI(AngularParser.ASSIContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(AngularParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(AngularParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#inputProperty}.
	 * @param ctx the parse tree
	 */
	void enterInputProperty(AngularParser.InputPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#inputProperty}.
	 * @param ctx the parse tree
	 */
	void exitInputProperty(AngularParser.InputPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#outputProperty}.
	 * @param ctx the parse tree
	 */
	void enterOutputProperty(AngularParser.OutputPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#outputProperty}.
	 * @param ctx the parse tree
	 */
	void exitOutputProperty(AngularParser.OutputPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(AngularParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(AngularParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCTIONCALL2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFUNCTIONCALL2(AngularParser.FUNCTIONCALL2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCTIONCALL2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFUNCTIONCALL2(AngularParser.FUNCTIONCALL2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code METHODCALL2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMETHODCALL2(AngularParser.METHODCALL2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code METHODCALL2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMETHODCALL2(AngularParser.METHODCALL2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ASSIGMENT2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterASSIGMENT2(AngularParser.ASSIGMENT2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ASSIGMENT2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitASSIGMENT2(AngularParser.ASSIGMENT2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code VIF3}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVIF3(AngularParser.VIF3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code VIF3}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVIF3(AngularParser.VIF3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LOOPSTATEMENT3}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLOOPSTATEMENT3(AngularParser.LOOPSTATEMENT3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LOOPSTATEMENT3}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLOOPSTATEMENT3(AngularParser.LOOPSTATEMENT3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code RETURNSTATEMENT2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRETURNSTATEMENT2(AngularParser.RETURNSTATEMENT2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code RETURNSTATEMENT2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRETURNSTATEMENT2(AngularParser.RETURNSTATEMENT2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ANYTYPE2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterANYTYPE2(AngularParser.ANYTYPE2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ANYTYPE2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitANYTYPE2(AngularParser.ANYTYPE2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PRINT2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPRINT2(AngularParser.PRINT2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PRINT2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPRINT2(AngularParser.PRINT2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(AngularParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(AngularParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(AngularParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(AngularParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(AngularParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(AngularParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(AngularParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(AngularParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(AngularParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(AngularParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNUMBER(AngularParser.NUMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNUMBER(AngularParser.NUMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BOOLEAN}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterBOOLEAN(AngularParser.BOOLEANContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BOOLEAN}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitBOOLEAN(AngularParser.BOOLEANContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULL}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNULL(AngularParser.NULLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NULL}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNULL(AngularParser.NULLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENTIFIER}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIDENTIFIER(AngularParser.IDENTIFIERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENTIFIER}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIDENTIFIER(AngularParser.IDENTIFIERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPRESSION1}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterEXPRESSION1(AngularParser.EXPRESSION1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPRESSION1}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitEXPRESSION1(AngularParser.EXPRESSION1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_type(AngularParser.Any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_type(AngularParser.Any_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(AngularParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(AngularParser.ProductContext ctx);
}