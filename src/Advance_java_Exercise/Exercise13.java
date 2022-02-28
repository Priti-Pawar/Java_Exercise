package Advance_java_Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1{
    String name;
    String id;
    public Employee1() {
    	
    }
    public Employee1(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public String toString() {
        return "Employee1{" + "name=" + name + ", id=" + id  + '}';
    }
    class ComparatorName  implements Comparator<Employee1>{
        @Override
         public int compare(Employee1 obj1, Employee1 obj2) {
        	return obj1.name.compareTo(obj2.name);
        }
    }
  
 }
class Department {
	int did;
	String dname;

public Department(String dname, int did) {
    this.dname = dname;
    this.did = did;
}
public String toString() {
    return "Department{" + "dname=" + dname + ", did=" + did  + '}';
}
class ComparatorName  implements Comparator<Employee1>{
    public int compare(Department obj1, Department obj2) {
    	return obj1.dname.compareTo(obj2.dname);
    }

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

}

public class Exercise13 {
	public static void main(String[] args) {
		 
        Employee1 emp1=new Employee1("Priti","4");
        Employee1 emp2=new Employee1("Tulsi","2");
        Employee1 emp3=new Employee1("Dakshata","1");
        ArrayList<Employee1> list=new ArrayList<Employee1>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("list Before sorting : \n"+list);
        Collections.sort(list,new Employee1().new ComparatorName());
        System.out.println("\n Sorting List :\n"+ list);
        
   	 
        Department dept1=new Department("BCA",4);
        Department dept2=new Department("MCA",2);
        Department dept3=new Department("MBA",1);
        ArrayList<Department> list1=new ArrayList<Department>();
        list1.add(dept1);
        list1.add(dept2);
        list1.add(dept3);
        System.out.println("list Before sorting : \n"+list);
        Collections.sort(list,new Department("MCA", 1).new ComparatorName());
        System.out.println("\n Sorting List :\n"+ list);
        
    }
}


