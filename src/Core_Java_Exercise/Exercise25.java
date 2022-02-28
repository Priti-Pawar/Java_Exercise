package Core_Java_Exercise;

public class Exercise25 {
	public static void main(String args[]) {
		int no=34;
		boolean flag=false;
		for(int i=2;i<=no/2;i++) {
			if(checkPrime(i)) {
				 if (checkPrime(no - i)) {
					 System.out.printf("%d = %d + %d\n", no, i, no - i);
			         flag = true;
				 }
			}
		}
				 
		if (!flag)
		    System.out.println(no+ " cannot be Expressed as Sum of Two Prime Numbers.");
	}
	static boolean checkPrime(int num) {
	    boolean isPrime = true;

	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        isPrime = false;
	        break;
	      }
	    }
	    return isPrime;
	}
}
	 