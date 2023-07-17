package test2;

public class Inheritance {

	public static void main(String[] args) {
		//single inheritance
		
		studentAAA Ram = new studentAAA("Krishna", "Shrama");
		
		System.out.println(Ram.firstName+ " "+ Ram.lastName);	
	
		ProfessorPPP PPP = new ProfessorPPP("Rita", "\tRai", 20000);
		
		PPP.DisplayName();
		PPP.DisplaySalary();
		

	

}}
class studentAAA {
	String firstName;
	String lastName;
	
	public studentAAA(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	public void DisplayName() {
		System.out.println(this.firstName+ this.lastName);
	}
}
class ProfessorPPP extends studentAAA {
	int salary;
	
	public ProfessorPPP(String fn, String ln ,int sal) {
		super(fn, ln);
		this.salary = sal;
	}
public void DisplaySalary() {
	System.out.println(this.salary);
}
}		
	 
	
	
	
	
	
	
	
