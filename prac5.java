package test2;

public class prac5 {

	public static void main(String[] args) {

	SonAA Nara = new SonAA("Ram", "Sharma", "Raja", "Nara");
		System.out.println(Nara.firstName);
		System.out.println(Nara.lastName);
		System.out.println(Nara.fFirstName);
		System.out.println(Nara.Sname);
		
		Nara.displayfFName();
		Nara.displayGFname();
		Nara.displaySname();	
	}
}
//Multilavel Inheritence with construction

class GrandFatherAA {

	String firstName;
	String lastName;

	public GrandFatherAA(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;

	}

	public void displayGFname() {
		System.out.println(this.firstName + this.lastName);

	}
}

class FatherAA extends GrandFatherAA {
	String fFirstName;

	public FatherAA(String firstName, String lastName, String ffn) {
		super(firstName, lastName);
		this.fFirstName = ffn;
	}
public void displayfFName() {
System.out.println(this.fFirstName+ this.lastName);
	
}	
}	
class SonAA extends FatherAA {
String Sname;

	public SonAA(String firstName, String lastName, String ffn, String ssn) {
		super(firstName, lastName, ffn);
		this.Sname = ssn;
	}
	public void displaySname() {
		System.out.println(this.Sname+ this.lastName);
	}
}
	
	
	
	
	

	

	
	
