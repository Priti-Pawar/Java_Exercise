//Write a program to print the Fibonacci series based on user input. Fibonacci series of first 6 numbers is  0,1,1,2,3,5
package Core_Java_Exercise;

import java.util.Scanner;

public class Exercise12 {
	public static void main(String args[]) {
		int n, a = 0, b = 0, c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = sc.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+",");
        }
    }
}
	
