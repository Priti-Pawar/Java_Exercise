package JavaExercise;
class student{
	String name;
	String courseEnrolled;

	void display(String n,String course){
	this.name=n;
	this.courseEnrolled=course;
	System.out.println(name + "has enrolled for " + courseEnrolled + " course");

	}
}
public class Exercise3 {
	public static void main(String args[]) {
		student obj=new student();
		obj.display("Ram","java");
		obj.display("Vicky","HTML");
		obj.display("Reena", "Spring");
	
	}

}
