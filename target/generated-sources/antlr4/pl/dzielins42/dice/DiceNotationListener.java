// Generated from pl\dzielins42\dice\DiceNotation.g4 by ANTLR 4.5
package pl.dzielins42.dice;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DiceNotationParser}.
 */
public interface DiceNotationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(DiceNotationParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(DiceNotationParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(DiceNotationParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(DiceNotationParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#intAdditionExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntAdditionExpr(DiceNotationParser.IntAdditionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#intAdditionExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntAdditionExpr(DiceNotationParser.IntAdditionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#intMultiplyExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntMultiplyExpr(DiceNotationParser.IntMultiplyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#intMultiplyExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntMultiplyExpr(DiceNotationParser.IntMultiplyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#intAtomExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntAtomExpr(DiceNotationParser.IntAtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#intAtomExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntAtomExpr(DiceNotationParser.IntAtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#baseRoll}.
	 * @param ctx the parse tree
	 */
	void enterBaseRoll(DiceNotationParser.BaseRollContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#baseRoll}.
	 * @param ctx the parse tree
	 */
	void exitBaseRoll(DiceNotationParser.BaseRollContext ctx);
}