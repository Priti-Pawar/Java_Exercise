//Write a Java program to append text to an existing file.
package Core_Java_Exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Exercise8 {
	public static void appendStrToFile(String fileName,
            String str)
{
		try {
			BufferedWriter out = new BufferedWriter(
new FileWriter(fileName, true));
			out.write(str);
			out.close();
		}
		catch (IOException e) {
			System.out.println("exception occurred" + e);
		}
}
	public static void main(String[] args) throws Exception
{

String fileName = "Exercise.txt";
try {
	BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
	out.write("Welcome Java:\n");
    out.close();
}
catch (IOException e) {
	System.out.println("Exception Occurred" + e);
}
String str = "This is java Exercise";
appendStrToFile(fileName, str);
try {
BufferedReader in = new BufferedReader(
new FileReader("Exercise.txt"));

String mystring;

while ((mystring = in.readLine()) != null) {
System.out.println(mystring);

}
}
catch (IOException e) {
System.out.println("Exception Occurred" + e);
}
}
}