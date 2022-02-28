package JavaExercise;
class mobile{
	String brand;
	String color;
	String camera;
	void display(String brand, String color, String camera) {
		this.brand=brand;
		this.color=color;
		this.camera=camera;
		System.out.println();
		System.out.println(" Abhishek own "+ brand+" "+color +" color smartphone having  "+camera+" camera");
	}
}

public class Exercise5 {
	public static void main(String args[]) {
		mobile obj=new mobile();
		obj.display("iPhone", "Gold", "8MP");
		obj.display("Samsung","White","13mp");
		obj.display("Nexus","Black","8mp");
		
		
	}

}
