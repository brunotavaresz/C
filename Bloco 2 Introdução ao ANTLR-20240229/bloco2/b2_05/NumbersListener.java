// Generated from Numbers.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NumbersParser}.
 */
public interface NumbersListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NumbersParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(NumbersParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(NumbersParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumbersParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(NumbersParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(NumbersParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumbersParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(NumbersParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(NumbersParser.ExprContext ctx);
}