package Core_Java_Exercise;
class degree{
	public void getDegree() {
		System.out.println("I got a degree");
	}
}
class undergraduate extends degree{
	public void getDegree() {
		System.out.println("I am an Undergraduate");
	}
}
class postgraduate extends degree{
	public void getDegree() {
		System.out.println("I am a postgraduate");
	}
}

public class Exercise30 {
	public static void main(String args[]) {
		degree d=new degree();
		undergraduate a= new undergraduate();
		postgraduate b=new postgraduate();
		d.getDegree();
		a.getDegree();
		b.getDegree();
	}

}
