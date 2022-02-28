//Write a Java program to copy one array list into another.
package Advance_java_Exercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
	public static void main(String args[]) {
		 ArrayList<Integer> list = new ArrayList<>();
		 list.add(1);
	     list.add(2);
	     list.add(3);
	     list.add(4);
	     ArrayList<Integer> list2 = list;
	     System.out.println("Iterating over the second ArrayList");
	        for (Integer value : list2) {
	            System.out.println(value);
	        }
	        list2.set(2, 10);
	        System.out.println("third element of first list =" + list.get(2));
	        System.out.println("third element of second list =" + list2.get(2));
	    }
	}