package test2;

public class Day20R {

	public static void main(String[] args) {
		
		
		
		
		StudentA shashi = new StudentA() ;
		System.out.println(shashi.firstName);
		System.out.println(shashi.lastName);
		System.out.println(shashi.ssn);
		shashi.displayName();	
		

		TeacherA shashia = new TeacherA();
		System.out.println(shashia.firstName);
		System.out.println(shashia.lastName);
		System.out.println(shashia.ssn);
		System.out.println(shashia.salary);
		
		shashia.displaySalary();
		shashia.displayName();
		
	}
	}

	class StudentA {

		String firstName = "Nisha";
		String lastName = "Sharma";
		int ssn = 12345;

		public void displayName() {
			System.out.println(this.firstName + this.lastName);
		}
	}

	class TeacherA extends StudentA {
		int salary = 20000;

	public void displaySalary() {
		System.out.println(this.salary);
	
	}
	
	
	}
