//Write a Java program to remove the third element from a array list.
package Advance_java_Exercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
	public static void main(String args[]) {
	List<String> list_str = new ArrayList<String>();
	list_str.add("Priti");
	list_str.add("Tulsi");
	list_str.add("Monika");
	list_str.add("Shivani");
	list_str.add("Dakshta");
	System.out.println(list_str);
	
	
	System.out.println(list_str);
	list_str.remove(2);
	System.out.println("After removin third variable \n:"+ list_str);
	}
}
