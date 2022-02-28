//Write a Java program to find the longest word in a text file.
package Core_Java_Exercise;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
 
public class Exercise9 {
	public static void main(String [ ] args) throws FileNotFoundException 
    {
        new Exercise9().findLongestWords();
    }
 
    public String findLongestWords() throws FileNotFoundException 
    {
        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File("C:\\Users\\Admin\\Desktop\\Test.text"));
 
        while (sc.hasNext()) 
        {
            current = sc.next();
            if (current.length() > longest_word.length()) 
            {
                longest_word = current;
            }
 
        }
        System.out.println("\n"+longest_word+"\n");
        return longest_word;
    }
}