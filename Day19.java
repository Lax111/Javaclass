//Laxmi chapagain

package test2;

public class Day19 {

	public static void main(String[] args) {
		
	StudentD sima = new StudentD("sima", "sharma", 678910);
	System.out.println(sima.firstName);
	System.out.println(sima.lastName);
	System.out.println(sima.ssn);
	sima.displayName();
		
		
	
	TeacherD simaa = new TeacherD("sima", "sharma",678910, 3000);
	System.out.println(simaa.firstName);
	System.out.println(simaa.lastName);
	System.out.println(simaa.ssn);
	System.out.println(simaa.salary);
	
	simaa.displayName();
	simaa.displaySalary();
	
	}}

	class StudentD {
		String firstName;
		String lastName;
		int ssn;
		
		public StudentD(String fn, String ln , int ss) {
		
		
		this.firstName = fn;
		this.lastName = ln;
		this.ssn = ss;
		
		}
		
		
			public void displayName() {
			System.out.println(this.firstName + this.lastName);
		}
	}
	
		class TeacherD extends StudentD {
			
			int salary;
			
			
		
			
			public TeacherD(String fn, String ln, int ss, int sal) {
			super(fn ,ln , ss);
			this.salary = sal;
			
		}
		
		public void displaySalary() {
			System.out.println(this.salary);
		}
		
		}
	
	
	
		
		
		

		

		
