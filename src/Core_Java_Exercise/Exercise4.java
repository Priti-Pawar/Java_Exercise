//Write a program to calculate your age as of today by giving your date of birth as input. Example you are born on 11 april 1989 and today is 22 april 2019 then output will be
package Core_Java_Exercise;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String args[]) {
		System.out.println("Eneter your date of birth :");
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();  
		sc.close(); 
		LocalDate dob = LocalDate.parse(input);  
		System.out.println("You are " + calculateAge(dob)+" years old."); 
}
	public static int calculateAge(LocalDate dob) {
	LocalDate curDate = LocalDate.now();  
	
	if ((dob != null) && (curDate != null))   
	{  
	return Period.between(dob, curDate).getYears();  
	}  
	else  
	{  
	return 0;  
	}  
	}  
	}  
