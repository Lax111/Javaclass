//Multilevel inheritance


package test2;

public class testtest {

	public static void main(String[] args) {
		
		SonSSS Gopal = new SonSSS("Madhav", "Sharma", "Govinda", "Gopal");
		
		System.out.println(Gopal.firstGNames);
		System.out.println(Gopal.sNames);
		System.out.println(Gopal.fNames);
		System.out.println(Gopal.lastNames);
		
		Gopal.displayGName();
		Gopal.displayFName();
		Gopal.displaySName();
		
		
		
		
	}	
}

class GrandFatherGGG{
	String firstGNames;
	String lastNames;
	
	public GrandFatherGGG(String fn,String ln) {
		this.firstGNames = fn;
		this.lastNames = ln;
	}
	
	public void displayGName() {
		System.out.println(this.firstGNames+this.lastNames);
	}
}
class FathersFFF extends GrandFatherGGG{
String fNames;

	public FathersFFF(String fn, String ln,String ffn) {
		super(fn, ln);
		this.fNames = ffn;
	}
	
	public void displayFName() {
		System.out.println(this.fNames+this.lastNames);
	}
}
class SonSSS extends FathersFFF{
String sNames;
	public SonSSS(String fn, String ln, String ffn,String sn) {
		super(fn, ln, ffn);
		this.sNames = sn;
		
	}	
		
	public void displaySName() {
		System.out.println(this.sNames+this.lastNames);
		
	

}
}






