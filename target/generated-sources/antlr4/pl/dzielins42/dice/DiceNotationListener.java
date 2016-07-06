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