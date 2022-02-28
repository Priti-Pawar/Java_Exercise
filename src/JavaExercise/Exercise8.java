package JavaExercise;
class AddAmount{
	int amount=50;
	public AddAmount() {
		
	}
	public AddAmount(int a) {
		amount=a+amount;
	}
	public void display() {
		System.out.println(amount);
	}
	
}

public class Exercise8 {
	public static void main(String args[]) {
		AddAmount obj=new AddAmount();
		AddAmount obj1=new AddAmount(30);
		obj.display();
		obj.display();
	}

}
