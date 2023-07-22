package test2;

public class Singleinherit {

	public static void main(String[] args) {
		
		Studentts SSS = new Studentts();
		SSS.displayName();
		
		SSS.firstName = "Ram";
		SSS.lastName = "Rai";
		
		
		
		System.out.println(SSS.firstName);
		System.out.println(SSS.lastName);
	
	}

}
class Studentts{
String firstName;
String lastName;


	public void displayName() {
		System.out.println("displayName");
	}
}

class Teacherrrs{
	String salary;

	public void displaySalary() {
		System.out.println("Salary");
	}
}