package composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	
	public Employee(String name, String dept, int salary) {
		super();
		subordinates = new ArrayList<Employee>();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public void add(Employee emp){
		subordinates.add(emp);
	}
	
	public void remove(Employee emp){
		subordinates.remove(emp);
	}
	
	public List<Employee> getSubordinates(){
		return subordinates;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary="
				+ salary + "]";
	}
	
}
