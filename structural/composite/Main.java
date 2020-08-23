/*
 * Composite pattern is used where we need to treat a group of objects in similar way as a single object.
 * This pattern creates a class contains group of its own objects. This class provides ways to modify its 
 * group of same objects.
 */
package composite;

public class Main {

	public static void main(String[] args) {
		Employee emp1  = new Employee("Frodo", "CS", 100);
		Employee emp2 = new Employee("Aragon", "EE", 200);
		Employee emp3 = new Employee("Eowyn", "EC", 300);
		
		Employee emp4 = new Employee("Fellowship", "ALL", 600);
		emp4.add(emp1);
		emp4.add(emp2);
		emp4.add(emp3);
		
		//same operation toString() applied on single object & group of objects.
		System.out.println(emp4.toString());
		for(Employee emp:emp4.getSubordinates()){
			System.out.println(emp.toString());
		}
	}

}
