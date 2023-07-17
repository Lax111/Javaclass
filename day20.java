package test2;

public class day20 {

	public static void main(String[] args) {
		
		
	Students a = new Students()	;
		
		System.out.println(a.firstName);
		System.out.println(a.lastName);
		System.out.println(a.ssn);
		
		
		
		
		Teachers aa = new Teachers();
			System.out.println(aa.firstName);
			System.out.println(aa.lastName);
			System.out.println(aa.ssn);
			System.out.println(aa.Salary);

		
			aa.displaySalary();
				aa.displayName();		
	}	
	}
class Students {
	
	String firstName = "Laxmi";
	String lastName = "Chapagain";
	int ssn = 123;
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
}
	
	class Teachers extends Students{
		
		int Salary = 20000;
		
		public void displaySalary() {
			System.out.println(this.Salary);
		}
	}
	
	
	
	
	
	
