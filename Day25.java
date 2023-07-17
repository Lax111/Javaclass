//Laxmi chapagain

package test2;

public class Day25 {

	public static void main(String[] args) {
		
       //you cannot create the object of abstract class
        //UsBank1 AA new USBank1();		
		
		
		
		PNC1 Maryland = new PNC1();
		
		Maryland.loan();
		Maryland.save();
		Maryland.branchName();
		Maryland.displayCountry();	
		
	}

}
abstract class USBank1 {
	
	//abstract method
	
	abstract void loan();
	abstract void save();
	
	public void displayCountry() {
		System.out.println("I am from Nepal");
	}
}

//you can not creat object of abstract class

class PNC1 extends USBank1 {
	
	public void loan() {
		System.out.println("I am loan from PNC1");
	}
	
	public void save() {
		System.out.println("I am save from PNC1");
	}
	
	public void branchName() {
		System.out.println("I am Maryland branch");
	}
}
	
	class BOA1 extends USBank1 {
		
		public void loan() {
			System.out.println("I am loan from BOA1");
		}
		
		public void save() {
			System.out.println("I am save from BOA1");
		}
		
		public void branchName() {
			System.out.println("I am Maryland branch - BOA1");
		}
	}
	
	
	
	
	
