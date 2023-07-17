package test2;

public class Day21c {

	public static void main(String[] args) {

		Son Kris = new Son("Krishna", "Sharmaaa", "Ram", "Kris");

		System.out.println(Kris.firstName);
		System.out.println(Kris.lastName);
		System.out.println(Kris.fFirstName);
		System.out.println(Kris.Sname);

		Kris.displayFName();
		Kris.displayGName();
		Kris.displaySName();

	}

}

//Multilevel inheritance
class GrandFather {

	String firstName;
	String lastName;

	public GrandFather(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void displayGName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class Father extends GrandFather {

	String fFirstName;

	public Father(String firstName, String lastName, String ffn) {

		super(firstName, lastName);
		this.fFirstName = ffn;
	}

	public void displayFName() {
		System.out.println(this.fFirstName + this.lastName);
	}

}

class Son extends Father {
	String Sname;

	public Son(String firstName, String lastName, String ffn, String sss) {
		super(firstName, lastName, ffn);
		this.Sname = sss;
	}

	public void displaySName() {
		System.out.println(this.Sname + this.lastName);
	}

}
