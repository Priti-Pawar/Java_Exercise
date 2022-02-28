package Advance_java_Exercise;


import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class Exercise4 {
	public static void main(String args[]) {
	 LinkedList<String> list = new LinkedList<String>();
	 list.add("Red");
	 list.add("Green");
	 list.add("White");
	 list.add("Black");
	 list.add("Yellow");
	 System.out.println("Original list:" + list);  
	 Iterator it = list.descendingIterator();
	 System.out.println("Iterate elements:");
	 while (it.hasNext()) {
		 System.out.println(it.next());
	     }
	  }
}
