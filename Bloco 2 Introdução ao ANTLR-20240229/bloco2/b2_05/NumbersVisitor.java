// Generated from Numbers.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NumbersParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NumbersVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NumbersParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(NumbersParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumbersParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(NumbersParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumbersParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(NumbersParser.ExprContext ctx);
}