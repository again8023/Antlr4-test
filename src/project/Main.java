package project;
import java.io.IOException;

import container.*;

public class Main{
	public static void main(String[] args) throws IOException {
		String DesignFile = args[0];
		
		VisitorOrientedParser parser = new VisitorOrientedParser();
		Design design = parser.parse(DesignFile);
		System.out.println("The design structure is \n");
		design.print();
	}
}