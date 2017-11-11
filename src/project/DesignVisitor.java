package project;

// Generated from Design.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DesignParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DesignVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DesignParser#design}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesign(DesignParser.DesignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesignParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(DesignParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesignParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin(DesignParser.BeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesignParser#hierarchy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchy(DesignParser.HierarchyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesignParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(DesignParser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesignParser#use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(DesignParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesignParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(DesignParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesignParser#embody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbody(DesignParser.EmbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesignParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(DesignParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesignParser#module_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_spec(DesignParser.Module_specContext ctx);
}