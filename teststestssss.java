//abstract

package test2;

public class teststestssss {

	public static void main(String[] args) {
	
		NRB NNN = new NRB();
		NNN.displayCountry();
		NNN.save();
		NNN.loan();	
		
	}}

abstract class NepalBank{
	abstract void loan();
	abstract void save();
	
	 public void displayCountry() {
		 System.out.println("nepal branch");
	
}
}
class NRB extends NepalBank{

	
	void loan() {
		System.out.println("loan from nrb");
		
	}

	
	void save() {
		System.out.println("save from nrb");
		
	}
	public void branchName() {
	System.out.println("nepal branch from nrb");
	}}
	
class NBB extends NepalBank{

	
	void loan() {
		System.out.println("loan from nrb");
		
	}

	
	void save() {
		System.out.println("save from nrb");
		
	}
	
public void branchName() {
System.out.println("nepal branch from nbb");




}
}