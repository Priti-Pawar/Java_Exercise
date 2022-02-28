//Write a Java program to get the value of a specified key in a map. Get value of key 3 in above map in exercise 1.
package Advance_java_Exercise;

import java.util.HashMap;

public class Exercise9 {
	public static void main(String args[]) {
		HashMap<Integer,String>list=new HashMap<Integer,String>();
		list.put(1, "Red");
		list.put(2, "Green");
		list.put(3, "Black");
		list.put(4, "White");
		list.put(5, "blue");
		 String val=(String)list.get(3); 
		 System.out.println("Value for key 3 is: " + val);
		
	}

}
