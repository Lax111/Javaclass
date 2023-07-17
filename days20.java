package test2;

public class days20 {

	public static void main(String[] args) {
		
		Student1 a = new Student1();
		
		System.out.println(a.firstName);
		System.out.println(a.lastName);
		System.out.println(a.ssn);	
		

		Teacher1 aa = new Teacher1();
		
		System.out.println(aa.firstName);
		System.out.println(aa.lastName);
		System.out.println(aa.ssn);
		System.out.println(aa.Salary);
		aa.displaySalary();
		
		
		
		
		
	}

}

class Student1 {
	
	String firstName = "Lax";
	String lastName = "Cha";
	int ssn = 123;
	
	
	public void displayName () {
		System.out.println(this.firstName + this.lastName);
	}
}

class Teacher1 extends Student1{
	
	int Salary = 2000;
	
	
	public void displaySalary() {
		System.out.println(this.Salary);
	}
	
}







	
