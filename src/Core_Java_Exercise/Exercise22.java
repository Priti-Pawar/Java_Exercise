package Core_Java_Exercise;

import java.util.Scanner;

public class Exercise22 {
	
	public static final int password_length = 8;

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
	        System.out.print("Enter Your Password : ");
	        String s = input.nextLine();

	        if (is_Valid_Password(s)) {
	            System.out.println("Password is valid: " + s);
	       
	        } else {
	            System.out.println("Password is invalid: " + s);
	        }
	}
	public static boolean is_Valid_Password(String password) {
		if (password.length() <  password_length) return false;
		int charCount = 0;
	    int numCount = 0;
	    for (int i = 0; i < password.length(); i++) {
	    	char ch = password.charAt(i);
	    	if (is_Numeric(ch)) numCount++;
	        else if (is_Letter(ch)) charCount++;
	        else return false;
	    }
	    return (charCount >= 2 && numCount >= 2);
	}
	public static boolean is_Letter(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'Z');
	}
	public static boolean is_Numeric(char ch) {
		return (ch >= '0' && ch <= '9');
	}
}