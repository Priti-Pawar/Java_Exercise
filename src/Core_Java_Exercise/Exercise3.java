//Write a program to reverse a 6 digit number using while or for loop.
package Core_Java_Exercise;

public class Exercise3 {
	public static void main(String args[]) {
		int num = 1234, reversed = 0;
	    
	    System.out.println("Original Number: " + num);
	    while(num != 0) {
	      int digit = num % 6;
	      reversed = reversed * 6 + digit;
	      num /= 6;
	    }

	    System.out.println("Reversed Number: " + reversed);
	  }
	}
	


