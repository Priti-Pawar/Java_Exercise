package Advance_java_Exercise;

import java.util.HashMap;
import java.util.TreeMap;

public class Exercise11 {
	public static void main(String args[]) {
		TreeMap <String,String> list = new TreeMap <String,String> ();
		list.put("C2", "Red");
		list.put("C1", "Green");
		list.put("C4", "Black");
		list.put("C3", "White");
		System.out.println("Orginal TreeMap content: " + list);
		System.out.println("Greatest key: " + list.firstKey());
	    System.out.println("Least key: " + list.lastKey());
	}

}
