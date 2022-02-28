//Write a program to reverse a string entered by user using recursion
package Core_Java_Exercise;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[]) {
		String str;
		System.out.println("Enter the string :");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		sc.close();
		String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }
	 public static String reverseString(String str)
	    {
	        if (str.isEmpty())
	            return str;
	      
	        return reverseString(str.substring(1)) + str.charAt(0);
	    }
	}



