// Generated from C:/Users/muzaic/Desktop/comp/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatements(AngularParser.ImportStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService(AngularParser.ServiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SELECTOR1}
	 * labeled alternative in {@link AngularParser#component_metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSELECTOR1(AngularParser.SELECTOR1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code STANDLONE}
	 * labeled alternative in {@link AngularParser#component_metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTANDLONE(AngularParser.STANDLONEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IMPORTS}
	 * labeled alternative in {@link AngularParser#component_metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIMPORTS(AngularParser.IMPORTSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TEMPLATEURL}
	 * labeled alternative in {@link AngularParser#component_metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTEMPLATEURL(AngularParser.TEMPLATEURLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STYLEURL}
	 * labeled alternative in {@link AngularParser#component_metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTYLEURL(AngularParser.STYLEURLContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(AngularParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(AngularParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SERVICE1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSERVICE1(AngularParser.SERVICE1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code CLASS1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCLASS1(AngularParser.CLASS1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code COMPONENTDECLARATION1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOMPONENTDECLARATION1(AngularParser.COMPONENTDECLARATION1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code IMPORTSTATEMENT1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIMPORTSTATEMENT1(AngularParser.IMPORTSTATEMENT1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ASSIGMENT1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASSIGMENT1(AngularParser.ASSIGMENT1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTIONCALL1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTIONCALL1(AngularParser.FUNCTIONCALL1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code METHODCALL1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMETHODCALL1(AngularParser.METHODCALL1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LOOPSTATEMENT1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOOPSTATEMENT1(AngularParser.LOOPSTATEMENT1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code RETURNSTATEMENT1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRETURNSTATEMENT1(AngularParser.RETURNSTATEMENT1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PRINT1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRINT1(AngularParser.PRINT1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code CONSTRUCTOR1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONSTRUCTOR1(AngularParser.CONSTRUCTOR1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code METHOD1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMETHOD1(AngularParser.METHOD1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code AnyType1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyType1(AngularParser.AnyType1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code VIF1}
	 * labeled alternative in {@link AngularParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVIF1(AngularParser.VIF1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#vif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVif(AngularParser.VifContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(AngularParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DIVELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIVELEMENT1(AngularParser.DIVELEMENT1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code HEADERELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHEADERELEMENT1(AngularParser.HEADERELEMENT1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code COMPONENTELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOMPONENTELEMENT1(AngularParser.COMPONENTELEMENT1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code IMAGEELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIMAGEELEMENT1(AngularParser.IMAGEELEMENT1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code BUTTONELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBUTTONELEMENT1(AngularParser.BUTTONELEMENT1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PARAGRAPHELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARAGRAPHELEMENT1(AngularParser.PARAGRAPHELEMENT1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code NGFORELEMENT1}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNGFORELEMENT1(AngularParser.NGFORELEMENT1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#divElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivElement(AngularParser.DivElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(AngularParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#headerElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderElement(AngularParser.HeaderElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#imageElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageElement(AngularParser.ImageElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(AngularParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#buttonElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonElement(AngularParser.ButtonElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton(AngularParser.ButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#paragraphElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraphElement(AngularParser.ParagraphElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngForElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgForElement(AngularParser.NgForElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentElement(AngularParser.ComponentElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#compElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompElement(AngularParser.CompElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDENTIFIER1}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDENTIFIER1(AngularParser.IDENTIFIER1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTRING(AngularParser.STRINGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INTERPOLATION1}
	 * labeled alternative in {@link AngularParser#elementContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINTERPOLATION1(AngularParser.INTERPOLATION1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(AngularParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CLASSATTRIBUTE1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCLASSATTRIBUTE1(AngularParser.CLASSATTRIBUTE1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code SCRATTRIBUTE1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSCRATTRIBUTE1(AngularParser.SCRATTRIBUTE1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ALTATTRIBUTE1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitALTATTRIBUTE1(AngularParser.ALTATTRIBUTE1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code STYLEATTRIBUTE1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTYLEATTRIBUTE1(AngularParser.STYLEATTRIBUTE1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code CLICKATTRIBUTE1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCLICKATTRIBUTE1(AngularParser.CLICKATTRIBUTE1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PROPERTYBINDING1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPROPERTYBINDING1(AngularParser.PROPERTYBINDING1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code EVENTBINDING1}
	 * labeled alternative in {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEVENTBINDING1(AngularParser.EVENTBINDING1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAttribute(AngularParser.ClassAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#srcAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrcAttribute(AngularParser.SrcAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#altAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltAttribute(AngularParser.AltAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styleAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttribute(AngularParser.StyleAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#clickAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClickAttribute(AngularParser.ClickAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#eventBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AngularParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(AngularParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(AngularParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(AngularParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(AngularParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classmem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassmem(AngularParser.ClassmemContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(AngularParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INPUTPROPERTY1}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINPUTPROPERTY1(AngularParser.INPUTPROPERTY1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code OUTPUTPROPRTY1}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOUTPUTPROPRTY1(AngularParser.OUTPUTPROPRTY1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code METHOD2}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMETHOD2(AngularParser.METHOD2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LOOPSTATEMENT2}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOOPSTATEMENT2(AngularParser.LOOPSTATEMENT2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code VIF2}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVIF2(AngularParser.VIF2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code CONSTRUCTOR2}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONSTRUCTOR2(AngularParser.CONSTRUCTOR2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ASSI}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASSI(AngularParser.ASSIContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(AngularParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#inputProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputProperty(AngularParser.InputPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#outputProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputProperty(AngularParser.OutputPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(AngularParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTIONCALL2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTIONCALL2(AngularParser.FUNCTIONCALL2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code METHODCALL2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMETHODCALL2(AngularParser.METHODCALL2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ASSIGMENT2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASSIGMENT2(AngularParser.ASSIGMENT2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code VIF3}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVIF3(AngularParser.VIF3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LOOPSTATEMENT3}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOOPSTATEMENT3(AngularParser.LOOPSTATEMENT3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code RETURNSTATEMENT2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRETURNSTATEMENT2(AngularParser.RETURNSTATEMENT2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ANYTYPE2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitANYTYPE2(AngularParser.ANYTYPE2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PRINT2}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRINT2(AngularParser.PRINT2Context ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(AngularParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(AngularParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(AngularParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(AngularParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(AngularParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMBER(AngularParser.NUMBERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BOOLEAN}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBOOLEAN(AngularParser.BOOLEANContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULL}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULL(AngularParser.NULLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDENTIFIER}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDENTIFIER(AngularParser.IDENTIFIERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPRESSION1}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPRESSION1(AngularParser.EXPRESSION1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#any_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_type(AngularParser.Any_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#product}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduct(AngularParser.ProductContext ctx);
}