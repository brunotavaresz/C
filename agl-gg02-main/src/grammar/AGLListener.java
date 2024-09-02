// Generated from AGL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AGLParser}.
 */
public interface AGLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AGLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AGLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AGLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AGLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AGLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(AGLParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(AGLParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AGLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AGLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instantiationWithProperties}
	 * labeled alternative in {@link AGLParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void enterInstantiationWithProperties(AGLParser.InstantiationWithPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instantiationWithProperties}
	 * labeled alternative in {@link AGLParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void exitInstantiationWithProperties(AGLParser.InstantiationWithPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instantiationWithExpression}
	 * labeled alternative in {@link AGLParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void enterInstantiationWithExpression(AGLParser.InstantiationWithExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instantiationWithExpression}
	 * labeled alternative in {@link AGLParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void exitInstantiationWithExpression(AGLParser.InstantiationWithExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instantiationAtPoint}
	 * labeled alternative in {@link AGLParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void enterInstantiationAtPoint(AGLParser.InstantiationAtPointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instantiationAtPoint}
	 * labeled alternative in {@link AGLParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void exitInstantiationAtPoint(AGLParser.InstantiationAtPointContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#referenceCommand}.
	 * @param ctx the parse tree
	 */
	void enterReferenceCommand(AGLParser.ReferenceCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#referenceCommand}.
	 * @param ctx the parse tree
	 */
	void exitReferenceCommand(AGLParser.ReferenceCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AGLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AGLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#propertyChange}.
	 * @param ctx the parse tree
	 */
	void enterPropertyChange(AGLParser.PropertyChangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#propertyChange}.
	 * @param ctx the parse tree
	 */
	void exitPropertyChange(AGLParser.PropertyChangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(AGLParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(AGLParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#propertyBlock}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBlock(AGLParser.PropertyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#propertyBlock}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBlock(AGLParser.PropertyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#waitCommand}.
	 * @param ctx the parse tree
	 */
	void enterWaitCommand(AGLParser.WaitCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#waitCommand}.
	 * @param ctx the parse tree
	 */
	void exitWaitCommand(AGLParser.WaitCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#closeCommand}.
	 * @param ctx the parse tree
	 */
	void enterCloseCommand(AGLParser.CloseCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#closeCommand}.
	 * @param ctx the parse tree
	 */
	void exitCloseCommand(AGLParser.CloseCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#refreshCommand}.
	 * @param ctx the parse tree
	 */
	void enterRefreshCommand(AGLParser.RefreshCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#refreshCommand}.
	 * @param ctx the parse tree
	 */
	void exitRefreshCommand(AGLParser.RefreshCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#printCommand}.
	 * @param ctx the parse tree
	 */
	void enterPrintCommand(AGLParser.PrintCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#printCommand}.
	 * @param ctx the parse tree
	 */
	void exitPrintCommand(AGLParser.PrintCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#moveCommand}.
	 * @param ctx the parse tree
	 */
	void enterMoveCommand(AGLParser.MoveCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#moveCommand}.
	 * @param ctx the parse tree
	 */
	void exitMoveCommand(AGLParser.MoveCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(AGLParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(AGLParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(AGLParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(AGLParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(AGLParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(AGLParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#importCommand}.
	 * @param ctx the parse tree
	 */
	void enterImportCommand(AGLParser.ImportCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#importCommand}.
	 * @param ctx the parse tree
	 */
	void exitImportCommand(AGLParser.ImportCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AGLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AGLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#view}.
	 * @param ctx the parse tree
	 */
	void enterView(AGLParser.ViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#view}.
	 * @param ctx the parse tree
	 */
	void exitView(AGLParser.ViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AGLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AGLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(AGLParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(AGLParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(AGLParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(AGLParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(AGLParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(AGLParser.TimeContext ctx);
}