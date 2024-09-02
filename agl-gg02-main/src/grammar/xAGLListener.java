// Generated from xAGL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xAGLParser}.
 */
public interface xAGLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link xAGLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(xAGLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAGLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(xAGLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAGLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(xAGLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAGLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(xAGLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAGLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(xAGLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAGLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(xAGLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAGLParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(xAGLParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAGLParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(xAGLParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAGLParser#refreshCommand}.
	 * @param ctx the parse tree
	 */
	void enterRefreshCommand(xAGLParser.RefreshCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAGLParser#refreshCommand}.
	 * @param ctx the parse tree
	 */
	void exitRefreshCommand(xAGLParser.RefreshCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAGLParser#moveCommand}.
	 * @param ctx the parse tree
	 */
	void enterMoveCommand(xAGLParser.MoveCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAGLParser#moveCommand}.
	 * @param ctx the parse tree
	 */
	void exitMoveCommand(xAGLParser.MoveCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAGLParser#waitCommand}.
	 * @param ctx the parse tree
	 */
	void enterWaitCommand(xAGLParser.WaitCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAGLParser#waitCommand}.
	 * @param ctx the parse tree
	 */
	void exitWaitCommand(xAGLParser.WaitCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAGLParser#propertyBlock}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBlock(xAGLParser.PropertyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAGLParser#propertyBlock}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBlock(xAGLParser.PropertyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAGLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(xAGLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAGLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(xAGLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAGLParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(xAGLParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAGLParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(xAGLParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAGLParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(xAGLParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAGLParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(xAGLParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link xAGLParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(xAGLParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link xAGLParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(xAGLParser.TimeContext ctx);
}