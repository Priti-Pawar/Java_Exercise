package Advance_java_Exercise;

import java.util.TreeSet;

public class Exercise7 {
	public static void main(String args[]) {
		TreeSet <Integer>list = new TreeSet<Integer>();
		TreeSet <Integer>list1 = new TreeSet<Integer>();
		list.add(10);
		list.add(22);
		list.add(36);
		list.add(25);
		list.add(16);
		list.add(70);
		list.add(82);
		list.add(89);
		list.add(14);
		System.out.println("Strictly greater than 76 : "+list.higher(76));
		System.out.println("Strictly greater than 31 : "+list.higher(31));
	}

}
