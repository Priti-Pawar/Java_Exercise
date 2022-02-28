package Core_Java_Exercise;

public class Exercise26 {
	void display(int a,int b) {
		System.out.println("Area of Rectangle is "+a*b);
		
	}
	void display(int c) {
		System.out.println("Area of Square is "+c*c);
		
	}
	public static void main(String args[]) {
		Exercise26 obj=new Exercise26();
		Exercise26 obj1=new Exercise26();
		obj.display(5,10);
		obj1.display(5);
	}

}
