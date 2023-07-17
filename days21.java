package test2;

public class days21 {

	public static void main(String[] args) {

		//// creating object of Studentss:
		
		Studentss Ram = new Studentss();
		
		System.out.println(Ram.firstName);
		System.out.println(Ram.lastName);
		System.out.println(Ram.age);

		Ram.age = 15;
		Ram.firstName = "Ram";
		Ram.lastName = "Sharmas";

		System.out.println(Ram.firstName);
		System.out.println(Ram.lastName);
		System.out.println(Ram.age);
		Ram.displayName();

		// creating object of Teacherss:

		Teacherss aaa = new Teacherss();
		System.out.println(aaa.salary);

		aaa.firstName = "Rama";
		aaa.lastName = "Sharmasss";
		aaa.age = 10;
		aaa.salary = 2300;

		System.out.println(aaa.firstName);
		System.out.println(aaa.lastName);
		System.out.println(aaa.age);

		aaa.displaySalary();
		aaa.displayName();

		
	}

}

class Studentss {

	String firstName;
	String lastName;
	int age;

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class Teacherss extends Studentss {

	int salary;

	public void displaySalary() {
		System.out.println(this.salary);

	}
}
