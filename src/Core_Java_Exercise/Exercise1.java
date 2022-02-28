//Write a program to check the input character is a vowel or consonant using switch case
package Core_Java_Exercise;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[]) {
		boolean isVowel=false;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=scanner.next().charAt(0); 
		scanner.close();
		switch(ch) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': System.out.println(ch+" is a Vowel.");
		break;
		default: System.out.println(ch+" is a Non-Vowel");
		}
	}
}
		