//Write a Java method to display the current date and time.
package Core_Java_Exercise;

import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Exercise7 {
	public static void main(String[] args) {  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date));  
	}  
}  
