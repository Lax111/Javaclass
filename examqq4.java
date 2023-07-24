package test2;

public class examqq4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PNC1 Catonsville = new PNC1();

		Catonsville.loan();
		Catonsville.save();
		Catonsville.branchName();
		Catonsville.displayCountry();

	}

}

abstract class USABank1 {


	abstract void loan();

	abstract void save();

	public void displayCountry() {
		System.out.println("I am from Nepal");
	}
}



class PNCQ extends USABank1 {

	public void loan() {
		System.out.println("loan from PNC1");
	}

	public void save() {
		System.out.println("save from PNC1");
	}

	public void branchName() {
		System.out.println("Catonsville branch");
	}
}

class BOAQ extends USBank1 {

	public void loan() {
		System.out.println("loan from BOAQ");
	}

	public void save() {
		System.out.println("save from BOAQ");
	}

	public void branchName() {
		System.out.println("Catonsville branch - BOAQ");
	}
}
