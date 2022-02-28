//Write a Java program to print all the elements of a ArrayList using the position of the elements. 
package Advance_java_Exercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
	public static void main(String args[]) {
		List<String> list_str = new ArrayList<String>();
		list_str.add("Priti");
		list_str.add("Tulsi");
		list_str.add("Monika");
		list_str.add("Shivani");
		list_str.add("Dakshta");
		System.out.println("Array List :"+list_str);
		System.out.println("Print all the elements :");
		int elements=list_str.size();
		for (int index = 0; index < elements; index++) {
			System.out.println(list_str.get(index));
		}
		
		

}
}
