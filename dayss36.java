package test2;

import java.util.Arrays;
import java.util.List;

public class dayss36 {

	public static void main(String[] args) {
		
		
		EmployeeQQQ [] employeeq = {
				
			new EmployeeQQQ(1,"kris,sharma",2000),	new EmployeeQQQ(2,"kris,sharma",3000),	
			new EmployeeQQQ(3,"kris,sharma",4000)		
		
	};
		
	//for(int i = 0; i <employeeq.length;i++) {
		//System.out.println([i].d);
	//}
	
	List<EmployeeQQQ> emplist = Arrays.asList(employeeq);
		
		emplist.stream().forEach(emp -> emp.incrementSalary(10));
		
		for(int i = 0;i < employeeq.length;i++) {
			System.out.println(employeeq[i].salary);
		}
		
		
	}

	}


class EmployeeQQQ{
	
	String fullName;
	int salary;
	int id;
	
	public EmployeeQQQ(int id, String fn, int sal) {
	this.fullName = fn;
	this.id = id;
	this.salary = sal;
	}
	
	public void displayFullName() {
		System.out.println(this.fullName);
	}
	
	public void incrementSalary(int x) {
		this.salary = this.salary + x;
	}
}
	
	
	
	
