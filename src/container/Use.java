package container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Use {
	public List<String> uses;
	
	public Use(List<String> _uses){
		uses = _uses;
	}
	
	public void print(){
		for (Iterator<String> item = this.uses.iterator(); item.hasNext();) {
			System.out.print("\t\t" + item.next());
			if(item.hasNext()) System.out.println(", ");
			else System.out.print(";");
		}
	}

}
