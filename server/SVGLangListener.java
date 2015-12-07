// Generated from SVGLang.g4 by ANTLR 4.4

 	import java.awt.Color;
 	import util.SVGparser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SVGLangParser}.
 */
public interface SVGLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SVGLangParser#end_point}.
	 * @param ctx the parse tree
	 */
	void enterEnd_point(@NotNull SVGLangParser.End_pointContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGLangParser#end_point}.
	 * @param ctx the parse tree
	 */
	void exitEnd_point(@NotNull SVGLangParser.End_pointContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGLangParser#start_point}.
	 * @param ctx the parse tree
	 */
	void enterStart_point(@NotNull SVGLangParser.Start_pointContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGLangParser#start_point}.
	 * @param ctx the parse tree
	 */
	void exitStart_point(@NotNull SVGLangParser.Start_pointContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGLangParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(@NotNull SVGLangParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGLangParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(@NotNull SVGLangParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGLangParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(@NotNull SVGLangParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGLangParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(@NotNull SVGLangParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGLangParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull SVGLangParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGLangParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull SVGLangParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGLangParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(@NotNull SVGLangParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGLangParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(@NotNull SVGLangParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGLangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull SVGLangParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGLangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull SVGLangParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGLangParser#circle}.
	 * @param ctx the parse tree
	 */
	void enterCircle(@NotNull SVGLangParser.CircleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGLangParser#circle}.
	 * @param ctx the parse tree
	 */
	void exitCircle(@NotNull SVGLangParser.CircleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGLangParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(@NotNull SVGLangParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGLangParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(@NotNull SVGLangParser.ShapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGLangParser#rect}.
	 * @param ctx the parse tree
	 */
	void enterRect(@NotNull SVGLangParser.RectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGLangParser#rect}.
	 * @param ctx the parse tree
	 */
	void exitRect(@NotNull SVGLangParser.RectContext ctx);
}