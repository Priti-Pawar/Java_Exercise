package Core_Java_Exercise;
class Print{
	void Printn(int a , char c){
		System.out.println("Integer is: "+a+ "\t Char is: "+c);
	}
	
     void Printn(char c,int a ){
    	 System.out.println("Char is: "+c+ "\tInteger is: "+a );
     }
}
public class Exercise29 {
	public static void main(String args[]) {
		Print obj = new Print();
		obj.Printn(10, 'A');
		obj.Printn('B', 5);
	}
}
	
