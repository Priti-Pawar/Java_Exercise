package JavaExercise;

import java.util.Scanner;

class AccountHolder{
	    String FirstName;
	    String Lastname;
	    int Age;
	    double AccountBal;

	    public void testEligibilityForCC() {
	    	
	        Scanner scn = new Scanner(System.in);
	        System.out.println("Cheaking Eligiblity For Credit card");
	        System.out.println("-----------------------------------------------------------------------------------------");
	        System.out.println(" ");
	        System.out.println("Enter first name");
	        FirstName = scn.next();
	        System.out.println("Enter last name");
	        Lastname = scn.next();
	        System.out.println("Enter age");
	        Age = scn.nextInt();
	        System.out.println("Enter account balance");
	        AccountBal = scn.nextInt();


	            if (Age > 25 && AccountBal >= 20000) {
	                System.out.println("----You are Eligible for Credit Card here are your details----");
	                System.out.println("FirstName :" + FirstName);
	                System.out.println("LastName :" + Lastname);
	                System.out.println("Age :" + Age);
	                System.out.println("AccountBal :" + AccountBal);

	            } else {
	                System.out.println("Not Eligible for Credit card");
	            }

	    }

public class Exercise1 {
	  public static void main (String[]args){
		  AccountHolder acc = new AccountHolder();
          acc.testEligibilityForCC();
      }
}
}

