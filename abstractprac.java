package test2;

public class abstractprac {

	public static void main(String[] args) {
		
		discover Catonsville = new discover();
		Catonsville.loan();
		Catonsville.save();
		Catonsville.branchname();
		Catonsville.displaybranch();
		
	}

}
abstract class usBank999{
	
	abstract void loan();
	
	abstract void save();
	
	public void displaybranch() {
		System.out.println("display");
}
}	
class discover extends usBank999{

	
	void loan() {
		System.out.println("Loan");
		
	}

	
	void save() {
	System.out.println("save");
	
	}
	public void branchname() {
		System.out.println("Maryland");
	
	}
	}

	class chases extends usBank999{

		
		void loan() {
		System.out.println("from loan");	
			
		}

		
		void save() {
			System.out.println("from save");
			
		}
	
	public void branchname() {
	System.out.println("Catonsville");
	
	}
		
	}