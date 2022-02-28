package JavaExercise;
class Rectangle{
	int lenght;
	int breadth;
	 public Rectangle(){
		 this.lenght=0;
		 this.breadth=0;
	 }
	 public Rectangle(int length,int breadth)
	    {
	        this.lenght=5;
	        this.breadth=10;
	    }
	public Rectangle(int lenght) {
		this.lenght=6;
		breadth=7;
		 
	 }
	public void calculate() {
		System.out.println(lenght*breadth);
	}
}

public class Exercise7 {
	public static void main(String args[]) {
	Rectangle obj=new Rectangle();
	obj.calculate();
	Rectangle obj1=new Rectangle(10,20);
	obj1.calculate();
	Rectangle obj2=new Rectangle(10);
	obj2.calculate();
	}
}
