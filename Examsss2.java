package test2;

public class Examsss2 {

	public static void main(String[] args) {
		DaughterS5 Rani = new DaughterS5("Krishna", "Rai", "Rani");
		SonZ1 Govin = new SonZ1("Krishna", "Rai", "Govin");

		 Govin.displaySName();
		 Govin.displayFName();

		Rani.displayDName();
		Rani.displayFName();

	}

}

class Fathersss {
	String firstName;
	String lastName;

	public Fathersss(String fn, String ln) {

		this.firstName = fn;
		this.lastName = ln;
	}

	public void displayFName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class SonZ1 extends FatherD {

	String Sname;

	public SonZ1(String fn, String ln, String sn) {
		super(fn, ln);
		this.Sname = sn;
	}

	public void displaySName() {
		System.out.println(this.Sname + this.lastName);
	}
}

class DaughterS5 extends Fathersss {
	String Dname;

	public DaughterS5(String fn, String ln, String dn) {
		super(fn, ln);
		this.Dname = dn;

	}

	public void displayDName() {
		System.out.println(this.Dname + this.lastName);

	}



	}


