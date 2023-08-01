//Overridding

package test2;

public class teststestss1 {

	public static void main(String[] args) {

		WellsFargo	Maryland = new WellsFargo("USA","Maryland");
			Maryland.displayMessage();
			Maryland.loanS();
			Maryland.saveS();
		
	}
}

class USASBank {
	String country;

	public USASBank(String cnt) {
		this.country = cnt;

	}

	public void loanS() {
		System.out.println("loan from USASBank");
	}

	public void saveS() {
		System.out.println("save from USASBank");
	}

	public static void displayMessage() {
		System.out.println("Welcome to USASBank");
	}
}

class CapitalOne extends USASBank {
	String branchname;

	public CapitalOne(String cnt, String bn) {
		super(cnt);
		this.branchname = bn;
	}

	public void loanS() {
		System.out.println("loan from CapitalOne");
	}

	public void saveS() {
		System.out.println("save from CapitalOne");
	}

	public static void displayMessage() {
		System.out.println("Welcome to CapitalOne");
	}
}

class WellsFargo extends USASBank {
	String branchname;

	public WellsFargo(String cnt, String bn) {
		super(cnt);
		this.branchname = bn;
	}

	public void loanS() {
		System.out.println("loan from WellsFargo");
	}

	public void saveS() {
		System.out.println("save from WellsFargo");
	}

	public static void displayMessage() {
		System.out.println("Welcome to WellsFargo");

	}

}
