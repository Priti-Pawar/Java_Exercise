package JavaExercise;

class student1{
	String n;
	String name;
	void student(String n) {
		this.name=n;
	}
	public student1() {
		name="Unknown";
	}
}

public class Exercise6 {
	public static void main(String[] args) {
		student1 obj = new student1();
        obj.n = "Priti";
        System.out.println(obj.n);
        System.out.println(obj.name);

}
}
