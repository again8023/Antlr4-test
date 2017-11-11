package container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Design {
	public List<Module> modules = new ArrayList<Module>();
	
	public Design(List<Module> _modules) {
		if(_modules != null) modules = _modules;
		else modules = new ArrayList<Module>();
	}

	public void print(){
		for (Iterator<Module> item = this.modules.iterator(); item.hasNext();) {
			item.next().print();
		}
	}
}