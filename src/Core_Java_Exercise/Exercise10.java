//Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise. If input is not a double but a integer user is prompted to input double variable only.
package Core_Java_Exercise;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		double n1 = sc.nextDouble();
		System.out.println("Enter second number:");
		double n2=sc.nextDouble();
		System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n1 < 1 );
	}

}
