//Write a Java program to get the current time in New York.
package Core_Java_Exercise;

import java.util.Calendar;
import java.util.TimeZone;

public class Exercise5 {
	public static void main(String[] args) {

    Calendar calNewYork = Calendar.getInstance();
    calNewYork.setTimeZone(TimeZone.getTimeZone("New York"));
	    System.out.println(); 
     System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
       + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
		   System.out.println(); 
   }
}
	


