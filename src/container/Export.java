package container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Export {
	public List<String> exports;
	
	public Export(List<String> _exports){
		exports = _exports;
	}
	
	public void print(){
		for (Iterator<String> item = this.exports.iterator(); item.hasNext();) {
			System.out.print("\t\t" + item.next());
			if(item.hasNext()) System.out.println(", ");
			else System.out.print(";");
		}
	}
}
