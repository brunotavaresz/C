// Generated from FracLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FracLangParser}.
 */
public interface FracLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FracLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FracLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FracLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(FracLangParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(FracLangParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(FracLangParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(FracLangParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FracLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FracLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link FracLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(FracLangParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link FracLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(FracLangParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link FracLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(FracLangParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link FracLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(FracLangParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FractionExpression}
	 * labeled alternative in {@link FracLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFractionExpression(FracLangParser.FractionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FractionExpression}
	 * labeled alternative in {@link FracLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFractionExpression(FracLangParser.FractionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link FracLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(FracLangParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link FracLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(FracLangParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link FracLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(FracLangParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link FracLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(FracLangParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link FracLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(FracLangParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link FracLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(FracLangParser.IdentifierExpressionContext ctx);
}