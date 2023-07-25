package test2;

public class Exams1 {

	public static void main(String[] args) {
		Son Krishna = new Son("Govinda", "Sharma", "Shyam", "Krishna");
		System.out.println(Krishna.firstName);
		System.out.println(Krishna.lastName);
		System.out.println(Krishna.Sname);
		System.out.println(Krishna.fFirstName);
		
		
		Krishna.displayGName();
		Krishna.displayFName();
		Krishna.displaySName();
		
		
	}

}
class GrandFather123{
	String firstName;
	String lastName;
	
	public GrandFather123(String fn,String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	public void displayGName() {
		System.out.println(this.firstName+ this.lastName);
	}
	
	
}
class FatherFFF extends GrandFather123{
String fFName;

	public FatherFFF(String fn, String ln,String ffn) {
		super(fn, ln);
		this.fFName = ffn;
		System.out.println(this.fFName+this.lastName);
	}
	
	public void displayfName() {
		System.out.println(this.firstName+ this.lastName);
	}

class Son extends FatherFFF{
String sName;

	public Son(String fn, String ln, String ffn,String sfn) {
		super(fn, ln, ffn);
		this.sName= sfn;
		System.out.println(this.sName+ this.lastName);
	}
	
	public void displaysName() {
		System.out.println(this.firstName+ this.lastName);
	}


}}




