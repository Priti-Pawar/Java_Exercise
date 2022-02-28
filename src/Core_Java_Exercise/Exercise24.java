// Write a Java Program to Count Vowels and Consonants in a String
package Core_Java_Exercise;

import java.util.Scanner;

public class Exercise24 {
	private static Scanner sc;
	public static void main(String[] args) {
		String vowConsStr;
		int i, vowels, consonants;
		vowels = consonants = 0;
		char ch;
		
		sc= new Scanner(System.in);

		System.out.print("\nEnter Vowel, Consonants String :");
		vowConsStr = sc.nextLine();
		
		for(i = 0; i < vowConsStr.length(); i++)
		{
			ch = vowConsStr.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
					ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				vowels++;
			}
			else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
				consonants++;
			}
		}		
		System.out.println("\nNumber of Vowel Characters :" + vowels);
		System.out.println("Number of Consonant Characters :" + consonants);
	}
}


