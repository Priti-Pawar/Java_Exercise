package Advance_java_Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise8 {
	public static void main(String args[])
	{
		HashMap<Integer,String>list=new HashMap<Integer,String>();
		list.put(1, "Red");
		list.put(2, "Green");
		list.put(3, "Black");
		list.put(4, "White");
		list.put(5, "blue");
		for(Map.Entry x:list.entrySet()){  
			System.out.println(x.getKey()+" "+x.getValue());  
		}
	}
}
		
	