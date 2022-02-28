//Write a program to throw a user defined exception. eg Create a exception which is thrown when the input string is less than 100.
package Core_Java_Exercise;

class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        super(s);
    }
}
public class Exercise15 {
	void productCheck(int weight) throws InvalidProductException{
		if(weight < 100){
			throw new InvalidProductException("Product Invalid");
	}
}
	   
	    public static void main(String args[])
	    {
	    	Exercise15 obj = new Exercise15();
	        try
	        {
	            obj.productCheck(60);
	        }
	        catch (InvalidProductException ex)
	        {
	            System.out.println("exception handeling");
	            System.out.println(ex.getMessage());
	        }
	    }
	}


