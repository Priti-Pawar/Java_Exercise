package JavaExercise;
class Accountant {
    String name;
    String emailid;
    String contactno;

    public void writeData(String name,String emailid,String contactno)
    {
    	this.name=name;
        this.emailid=emailid;
        this.contactno=contactno;

        System.out.println(" Accountant "+ name+" has mail id "+emailid +" and "+contactno);
    }
}
public class Exercise4 {
	public static void main(String args[]) {
		Accountant acc=new Accountant();
        acc.writeData("ravi","ravi@gmail.com","9867785694");
        acc.writeData("rutuja","rutuja@gmail.com ","9987565634" );

	}
		
}

