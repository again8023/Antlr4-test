package container;

import java.util.ArrayList;
import java.util.List;

public abstract class Module {
	public String name;
	public Export exports;
	public Use uses;
	
	public Module(String _name, Export _exports, Use _uses) {
		name = _name;
		exports = _exports;
		uses = _uses;
	}

	public abstract void print();
}
