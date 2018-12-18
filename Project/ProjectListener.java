// Generated from Project.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjectParser}.
 */
public interface ProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProjectParser#chat}.
	 * @param ctx the parse tree
	 */
	void enterChat(ProjectParser.ChatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#chat}.
	 * @param ctx the parse tree
	 */
	void exitChat(ProjectParser.ChatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(ProjectParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(ProjectParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(ProjectParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(ProjectParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ProjectParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ProjectParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ProjectParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ProjectParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#mention}.
	 * @param ctx the parse tree
	 */
	void enterMention(ProjectParser.MentionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#mention}.
	 * @param ctx the parse tree
	 */
	void exitMention(ProjectParser.MentionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#emotion}.
	 * @param ctx the parse tree
	 */
	void enterEmotion(ProjectParser.EmotionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#emotion}.
	 * @param ctx the parse tree
	 */
	void exitEmotion(ProjectParser.EmotionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(ProjectParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(ProjectParser.MathContext ctx);
}