package test2;

public class testpra {

	public static void main(String[] args) {
		
		StudentsSS KriSS = new StudentsSS();
		
	System.out.println(KriSS.firstName);
	System.out.println(KriSS.lastName);

	
			
	KriSS.firstName = "KriSS";
	KriSS.lastName = "SharmSS";
	
	System.out.println(KriSS.firstName);
	System.out.println(KriSS.lastName);
	KriSS.displayName();
	
	Professor2 TTT = new Professor2();
	
	System.out.println(TTT.salary);
	
	TTT.firstName = "Ram";
	TTT.lastName = "Rai";
	TTT.salary = 2000;
	
	System.out.println(TTT.firstName);
	System.out.println(TTT.lastName);
	System.out.println(TTT.salary);
	
	
	TTT.displayName();
	TTT.displaysalary();
	
		}
		
	
	}


class StudentsSS {
	
	String firstName;
	String lastName;
	
	public void displayName() {
		System.out.println(this.firstName+ this.lastName);
	}
	
}
class Professor2 extends StudentsSS {
	int salary;
	
	public void displaysalary() {
		System.out.println(this.salary);
	}
}