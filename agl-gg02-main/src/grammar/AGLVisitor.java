// Generated from AGL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AGLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AGLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AGLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AGLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AGLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(AGLParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AGLParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instantiationWithProperties}
	 * labeled alternative in {@link AGLParser#instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiationWithProperties(AGLParser.InstantiationWithPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instantiationWithExpression}
	 * labeled alternative in {@link AGLParser#instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiationWithExpression(AGLParser.InstantiationWithExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instantiationAtPoint}
	 * labeled alternative in {@link AGLParser#instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiationAtPoint(AGLParser.InstantiationAtPointContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#referenceCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceCommand(AGLParser.ReferenceCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AGLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#propertyChange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyChange(AGLParser.PropertyChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(AGLParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#propertyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBlock(AGLParser.PropertyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#waitCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitCommand(AGLParser.WaitCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#closeCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseCommand(AGLParser.CloseCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#refreshCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshCommand(AGLParser.RefreshCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#printCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCommand(AGLParser.PrintCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#moveCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveCommand(AGLParser.MoveCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(AGLParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(AGLParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(AGLParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#importCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportCommand(AGLParser.ImportCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AGLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView(AGLParser.ViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AGLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(AGLParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(AGLParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AGLParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(AGLParser.TimeContext ctx);
}