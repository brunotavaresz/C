// Generated from xAGL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link xAGLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface xAGLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link xAGLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(xAGLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link xAGLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(xAGLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link xAGLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(xAGLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link xAGLParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(xAGLParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link xAGLParser#refreshCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshCommand(xAGLParser.RefreshCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link xAGLParser#moveCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveCommand(xAGLParser.MoveCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link xAGLParser#waitCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitCommand(xAGLParser.WaitCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link xAGLParser#propertyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBlock(xAGLParser.PropertyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link xAGLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(xAGLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link xAGLParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(xAGLParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link xAGLParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(xAGLParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link xAGLParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(xAGLParser.TimeContext ctx);
}