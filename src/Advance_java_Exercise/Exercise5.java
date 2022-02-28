//Write a Java program to convert a hash set to a List/ArrayList.
package Advance_java_Exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercise5 {
	public static void main(String args[]) {
		HashSet<String> list = new HashSet<String>();
		list.add("Priti");
		list.add("Tulsi");
		list.add("Monika");
		list.add("Shivani");
		list.add("Dakshta");
		System.out.println("Hash Set :"+list);
		List<String> list1 = new ArrayList<String>(list);
		System.out.println("Array List :"+list1);
	}
}