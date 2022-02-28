//Write a Java program to get the first and last elements in a tree set.

package Advance_java_Exercise;

import java.util.TreeSet;

public class Exercise6 {
	public static void main(String args[]) {
		TreeSet<String> list = new TreeSet<String>();
		list.add("Black");
		list.add("Green");
		list.add("Orange");
		list.add("Red");
		list.add("White");
		System.out.println("Tree set :");
		System.out.println(list);
		Object f_element = list.first();
		System.out.println("First Element : "+f_element);
		Object l_element=list.last();
		System.out.println("Last Element :"+l_element);
		
		
	}

}
