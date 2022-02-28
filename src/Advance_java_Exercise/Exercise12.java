//create a employee class with name and employeeId . Print the sorted list of employees by name .
package Advance_java_Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
    String name;
    String id;
    public Employee() {
    	
    }
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id  + '}';
    }
    class ComparatorName  implements Comparator<Employee>{
        @Override
         public int compare(Employee obj1, Employee obj2) {
        	return obj1.name.compareTo(obj2.name);
        }
    }
  
 }

public class Exercise12 {
	public static void main(String[] args) {
		 
        Employee emp1=new Employee("Priti","4");
        Employee emp2=new Employee("Tulsi","2");
        Employee emp3=new Employee("Dakshata","1");
        

        ArrayList<Employee> list=new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
      
        System.out.println("list Before sorting : \n"+list);
 
        Collections.sort(list,new Employee().new ComparatorName());
        System.out.println("\n Sorting List :\n"+ list);
    }
}


