package test2;

public class days21b {

	//single inheritance
	
	public static void main(String[] args) {

		StudentN ram = new StudentN("ram","sharmaN",25);

		TeacherN rama = new TeacherN("rama", "sharmaN", 25, 4000);

		System.out.println(rama.firstName);
		System.out.println(rama.lastName);
		System.out.println(rama.age);
		System.out.println(rama.salary);
		
		rama.displayName();
		rama.displaySalary();
		
		
	}

}

class StudentN {

	String firstName;
	String lastName;
	int age;

	public StudentN(String fn, String ln, int ag) {

		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;

	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

class TeacherN extends StudentN {

	int salary;

	public TeacherN(String fn, String ln, int ag, int sal) {
		super(fn, ln, ag);
		this.salary = sal;
	}

	public void displaySalary() {
		System.out.println(this.salary);

	}
}
