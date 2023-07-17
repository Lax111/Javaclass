package test2;

public class days21c {

	public static void main(String[] args) {
		
	Sonn Sam = new Sonn	("Govind","Sharmaes", "Ram1", "Sam");
		
	System.out.println(Sam.firstName);
	System.out.println(Sam.lastName);
	System.out.println(Sam.fFirstName);
	System.out.println(Sam.Sname);
	
	
	Sam.displayFName();
	Sam.displaySName();
	Sam.displayGName();
	
	
	
	}

}
class GrandFathers {
	
	String firstName;
	String lastName;
	
	public GrandFathers(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	public void displayGName() {
		System.out.println(this.firstName + this.lastName);
	}
}
class Fatherss1 extends GrandFathers {

	String fFirstName;
	
	public Fatherss1(String firstName, String lastName, String ffn) {
		super(firstName, lastName);
		this.fFirstName = ffn;
	}
	 public void displayFName() {
		 System.out.println(this.fFirstName + this.lastName);
	 }
	
}
	class Sonn extends Fatherss1 {

		String Sname;
		
		public Sonn(String firstName, String lastName, String ffn, String ssn) {
			super(firstName, lastName, ffn);
		this.Sname = ssn;
		}
		public void displaySName() {
			System.out.println(this.Sname + this.lastName);
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
