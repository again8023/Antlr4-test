package container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hierarchy {
	public List<String> contents = new ArrayList<String>();
	
	public Hierarchy(List<String> _contents){
		contents = _contents;
	}
	
	public void print(){
		for (Iterator<String> item = this.contents.iterator(); item.hasNext();) {
			System.out.print("\t\t" + item.next());
			if(item.hasNext()) System.out.println(", ");
			else System.out.print(";");
		}
	}
}