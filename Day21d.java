package test2;

public class Day21d {

	public static void main(String[] args) {

		Daughter Ladli = new Daughter("Krishn", "Sharmaaa", "Ladli");
		SonZ Kris = new SonZ("Krishn", "Sharmaaa", "Kris");

		Kris.displaySName();
		Kris.displayFName();

		Ladli.displayDName();
		Ladli.displayFName();

	}

}
//heirachical    inheritence
class FatherD {
	String firstName;
	String lastName;

	public FatherD(String fn, String ln) {

		this.firstName = fn;
		this.lastName = ln;
	}

	public void displayFName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class SonZ extends FatherD {

	String Sname;

	public SonZ(String fn, String ln, String sn) {
		super(fn, ln);
		this.Sname = sn;
	}

	public void displaySName() {
		System.out.println(this.Sname + this.lastName);
	}
}

class Daughter extends FatherD {
	String Dname;

	public Daughter(String fn, String ln, String dn) {
		super(fn, ln);
		this.Dname = dn;

	}

	public void displayDName() {
		System.out.println(this.Dname + this.lastName);

	}
}
