//Write a Java program to remove all of the mappings from a map in exercise 1.
package Advance_java_Exercise;

import java.util.HashMap;

public class Exercise10 {
	public static void main(String args[]) {
	HashMap<Integer,String>list=new HashMap<Integer,String>();
	list.put(1, "Red");
	list.put(2, "Green");
	list.put(3, "Black");
	list.put(4, "White");
	list.put(5, "blue");
	System.out.println("the mappings"+list);
	list.clear();
	System.out.println("the new mapp:"+list);
	}

}
