//Write a program to find the GCD - greatest common divisor of two number using for loop.
package Core_Java_Exercise;

public class Exercise11 {
	public static void main(String args[]) {
		int n1=4;
		int n2=10;
		int gcd=1;
		for(int i = 1; i <= n1 && i <= n2; i++)  
		{ 
			if(n1%i==0 && n2%i==0)  
				gcd = i;  
		} 
		System.out.printf("GCD of %d and %d is: %d", n1, n2, gcd); 
	}
}

	
	