package test2;

public class pras1 {

	public static void main(String[] args) {

		Daughter1234 Siru = new	Daughter1234("Ram","Khanal","Siru");
		Son123 Somu = new Son123("Ram","Khanal","Somu");
		
		Siru.displayDName();
		Siru.displayFName();
		
		Somu.displayFName();
		Somu.displaySName();
		
	}

}

class Father123 {

	String fName;
	String lName;

	public Father123(String fn, String ln) {
		this.fName = fn;
		this.lName = ln;
	}

	public void displayFName() {
		System.out.println(this.fName + this.lName);

	}
}

class Son123 extends Father123 {
	String Sname;

	public Son123(String fn, String ln, String sn) {
		super(fn, ln);
		this.Sname = sn;
	}

	public void displaySName() {
		System.out.println(this.Sname + this.lName);

	}
}

class Daughter1234 extends Father123 {
	String Dname;

	public Daughter1234(String fn, String ln, String dn) {
			super(fn, ln);
			this.Dname = dn;
		}
	public void displayDName() {
		System.out.println(this.Dname+ this.lName);
	}
	
	
	
	
	
	
}