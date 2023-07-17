package test2;

public class Examssss2 {

	public static void main(String[] args) {

		TeacherK Govi = new TeacherK("Govi", "Acharya", 16, 1000);

		System.out.println(Govi.firstName);
		System.out.println(Govi.lastName);
		System.out.println(Govi.age);
		System.out.println(Govi.salary);
		
		
		Govi.displayName();
		Govi.displaySalary();
		
	}

}

class Studentsk {

	String firstName;
	String lastName;
	int age;

	public Studentsk(String fn, String ln, int ag) {

		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class TeacherK extends Studentsk {

	int salary;

	public TeacherK(String fn, String ln, int ag, int sal) {
		super(fn, ln, ag);
		this.salary = sal;

	}

	public void displaySalary() {
		System.out.println(this.salary);

	}
}
