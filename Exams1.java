package test2;

public class Exams1 {

	public static void main(String[] args) {
		Son Krishna = new Son("Govinda", "Sharma", "Shyam", "Krishna");
		System.out.println(Krishna.fFName);
		System.out.println(Krishna.lastName);
		System.out.println(Krishna.Sname);
		System.out.println(Krishna.fFName);
		
		
		Krishna.displayGName();
		Krishna.displayfName();
		Krishna.displaySName();
		
		
	}

}
class GrandFather{
	String firstName;
	String lastName;
	
	public GrandFather(String fn,String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	public void displayGName() {
		System.out.println(this.firstName+ this.lastName);
	}
	
	
}
class Father extends GrandFather{
String fFName;

	public Father(String fn, String ln,String ffn) {
		super(fn, ln);
		this.fFName = ffn;
		System.out.println(this.fFName+this.lastName);
	}
	
	public void displayfName() {
		System.out.println(this.firstName+ this.lastName);
	}
class Son extends Father{
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




