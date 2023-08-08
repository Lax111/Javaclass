package test2;

import java.util.Arrays;
import java.util.List;

public class Day36 {

	public static void main(String[] args) {
		
		
		
		Employee [] employees = {
				new Employee(1,"Soraj sharma", 2000),
				new Employee(2,"Shashi sharma", 4000),
				new Employee(3,"Sima sharma", 6000),
		
		};
		
		List<Employee>emplist = Arrays.asList(employees);
		
		//for each()
		
		emplist.stream().forEach(emp-> emp.incrementSalary(100));
		
		for(int j = 0; j < employees.length; j++) {
		System.out.println(employees[j].salary);
		}                                                                                                                                                                               
		}	
}
class Employee{
	
	String fullname;
	int salary;
	int id;
	
	public Employee(int id, String fn, int sal) {
		this.fullname = fn;
		this.id = id;
		this.salary = sal;
	}
	
	public void displayName() {
		System.out.println(this.fullname);
		
		}
	
	public void incrementSalary(int x) {
		this.salary = this.salary + x;
		//this.salary + = x;
	
}
	
}