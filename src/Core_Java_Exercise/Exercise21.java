// Java Program to Calculate the Power of a Number using while loop only with using ready made Math.pow() method. Eg base=3 exponent = 4 then result will be 3x3x3x3=81
package Core_Java_Exercise;

public class Exercise21 {
	public static void main(String[] args) {

	    int base = 3, exponent = 4;

	    long result = 1;

	    while (exponent != 0) {
	      result *= base;
	      --exponent;
	    }

	    System.out.println("Result = " + result);
	  }
}


