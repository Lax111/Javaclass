//Laxmi Chapagain

//single inheritance without constructor
package test2;

public class Day21a {

	public static void main(String[] args) {

		Studentx Kris = new Studentx();
		
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
		
		
		//Creating object of TeacherA:
		
		
		TeacherX x = new TeacherX();
		
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

class Studentx {

	String firstName;
	String lastName;
	int age;

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

class TeacherX extends Studentx {
	int salary;
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
}








