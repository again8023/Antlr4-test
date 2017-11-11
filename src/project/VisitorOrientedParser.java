package project;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.*;
import container.*;

public class VisitorOrientedParser{
	public Design parse(String DesignFile) throws IOException{
		 CharStream charStream = CharStreams.fromFileName(DesignFile);
	     DesignLexer lexer = new DesignLexer(charStream);
	     CommonTokenStream tokens = new CommonTokenStream(lexer);
	     DesignParser parser = new DesignParser(tokens);

	     DesignVisitor designVisitor = new DesignVisitor();
	     Design traverseResult = designVisitor.visitDesign(parser.design());
	     return traverseResult;
	}
	
	private static class DesignVisitor extends DesignBaseVisitor<Design> {
        @Override
        public Design visitDesign(DesignParser.DesignContext ctx) {
            ModuleVisitor moduleVisitor = new ModuleVisitor();
            List<Module> modules = ctx.module() //return a list of ModuleContext
                    .stream()
                    .map(module -> module.accept(moduleVisitor))
                    .collect(Collectors.toList());
            return new Design(modules);
        }
    }
	
	private static class ModuleVisitor extends DesignBaseVisitor<Module> {
        @Override
        public Module visitModule(DesignParser.ModuleContext ctx) {
            String moduleName = ctx.begin().getChild(1).getText(); //get Module name
            HierarchyVisitor hierarchyVisitor = new HierarchyVisitor();
            ExportVisitor exportVisitor = new ExportVisitor();
            UseVisitor useVisitor = new UseVisitor();
        	Hierarchy hierarchy = ctx.hierarchy().accept(hierarchyVisitor);
        	Export exports = ctx.export().accept(exportVisitor);
        	Use uses = ctx.use().accept(useVisitor);
        	if(ctx.hierarchy().getChild(0).getText().equals("consistsof")){
        		return new ElementaryModule(moduleName, hierarchy,exports,uses);}
        	else
        		return new NonElementaryModule(moduleName, hierarchy,exports,uses);
        }
        			
    }
	private static class HierarchyVisitor extends DesignBaseVisitor<Hierarchy> {
        @Override
        public Hierarchy visitHierarchy(DesignParser.HierarchyContext ctx) {
        	ContentVisitor contentVisitor = new ContentVisitor();
        	ModuleSpecVisitor moduleSpecVisitor = new ModuleSpecVisitor();
        	if(ctx.embody().getText().equals("consistsof")){
        		List<String> contents = ctx.content()
        				.stream()
        				.map(content -> content.accept(contentVisitor))
        				.collect(Collectors.toList());
        		return new Hierarchy(contents);
        	}
        	else{
        		List<String> contents = ctx.module_spec()
        				.stream()
        				.map(module_spec -> module_spec.accept(moduleSpecVisitor))
        				.collect(Collectors.toList());
        		return new Hierarchy(contents);
        	}
        	 
        }
	}
	
	private static class ExportVisitor extends DesignBaseVisitor<Export> {
        @Override
        public Export visitExport(DesignParser.ExportContext ctx) {
        	ContentVisitor contentVisitor = new ContentVisitor();
        	List<String> contents = ctx.content()
    				.stream()
    				.map(content -> content.accept(contentVisitor))
    				.collect(Collectors.toList());
        	return new Export(contents);
        }
	}
	
	private static class UseVisitor extends DesignBaseVisitor<Use> {
        @Override
        public Use visitUse(DesignParser.UseContext ctx) {
        	ModuleSpecVisitor moduleSpecVisitor = new ModuleSpecVisitor();
        	List<String> contents = ctx.module_spec()
    				.stream()
    				.map(module_spec -> module_spec.accept(moduleSpecVisitor))
    				.collect(Collectors.toList());
        	return new Use(contents);
        }
	}
	
	private static class ContentVisitor extends DesignBaseVisitor<String> {
		@Override
		public String visitContent(DesignParser.ContentContext ctx){
			String content = ctx.getText();
			return content;
		}
	}
	private static class ModuleSpecVisitor extends DesignBaseVisitor<String> {
		@Override
		public String visitModule_spec(DesignParser.Module_specContext ctx){
			String module_spec = ctx.getText();
			return module_spec;
		}
	}

	
}