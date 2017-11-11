package project;

// Generated from Design.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DesignParser}.
 */
public interface DesignListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DesignParser#design}.
	 * @param ctx the parse tree
	 */
	void enterDesign(DesignParser.DesignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesignParser#design}.
	 * @param ctx the parse tree
	 */
	void exitDesign(DesignParser.DesignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesignParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(DesignParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesignParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(DesignParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesignParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(DesignParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesignParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(DesignParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesignParser#hierarchy}.
	 * @param ctx the parse tree
	 */
	void enterHierarchy(DesignParser.HierarchyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesignParser#hierarchy}.
	 * @param ctx the parse tree
	 */
	void exitHierarchy(DesignParser.HierarchyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesignParser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(DesignParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesignParser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(DesignParser.ExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesignParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(DesignParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesignParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(DesignParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesignParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(DesignParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesignParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(DesignParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesignParser#embody}.
	 * @param ctx the parse tree
	 */
	void enterEmbody(DesignParser.EmbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesignParser#embody}.
	 * @param ctx the parse tree
	 */
	void exitEmbody(DesignParser.EmbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesignParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(DesignParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesignParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(DesignParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesignParser#module_spec}.
	 * @param ctx the parse tree
	 */
	void enterModule_spec(DesignParser.Module_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesignParser#module_spec}.
	 * @param ctx the parse tree
	 */
	void exitModule_spec(DesignParser.Module_specContext ctx);
}