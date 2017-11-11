package container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NonElementaryModule extends Module{
	public Hierarchy comprises;

	public NonElementaryModule(String _name, Hierarchy _comprises, Export _exports, Use _uses) {
		super(_name, _exports, _uses);
		comprises = _comprises;
	}
	
	@Override
	  public void print() {
		System.out.print("\n___________________________________");

		// print the module name
		System.out.print("\nmodule " + this.name);

		// print the module's "comprises" list (list of contents)
		System.out.println("\n\tcomprises");
		this.comprises.print();

		// print the module's "exports" list (list of contents)
		System.out.println("\n\texports ");
		this.exports.print();

		// print the module's "uses" list (list of modules)
		System.out.println("\n\tuses ");
		this.uses.print();

		// print end of a module
		System.out.print("\nend " + this.name);
	}
}
