//write a java method to count all vowels in a string
package Core_Java_Exercise;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String args[]) {
		int count = 0;
	      System.out.println("Enter a sentence :");
	      Scanner sc = new Scanner(System.in);
	      String sentence = sc.nextLine();

	      for (int i=0 ; i<sentence.length(); i++){
	         char ch = sentence.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
	            count ++;
	         }
	      }
	      System.out.println("Number of vowels : "+count);
	   }
	}

	