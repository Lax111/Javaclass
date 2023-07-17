package test2;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentsx Kris = new Studentsx();

		System.out.println(Kris.firstName);
		System.out.println(Kris.lastName);
		System.out.println(Kris.age);

		Kris.age = 20;
		Kris.firstName = "Kris";
		Kris.lastName = "Sharma";

		System.out.println(Kris.firstName);
		System.out.println(Kris.lastName);
		System.out.println(Kris.age);
		Kris.displayName();

		TeachersX x = new TeachersX();

		System.out.println(x.salary);

		x.firstName = "Krish";
		x.lastName = "Sharmaa";
		x.age = 25;
		x.salary = 3000;

		System.out.println(x.firstName);
		System.out.println(x.lastName);
		System.out.println(x.age);

		x.displayName();
		x.displaySalary();

	}

}

class Studentsx {

	String firstName;
	String lastName;
	int age;

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

class TeachersX extends Studentsx {
	int salary;

	public void displaySalary() {
		System.out.println(this.salary);
	}
}