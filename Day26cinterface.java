package test2;
interface Himalayan{
	public void save();
	public void loan();
}
interface Himalayan1{
	public void DisplayCountry();
	public void DisplayCity();
}

public class Day26cinterface {

	public static void main(String[] args) {
		
		BankS ktm = new BankS();
		ktm.DisplayCity();
		ktm.DisplayCountry();
		ktm.loan();
		ktm.save();
			
	}
	}
class BankS implements Himalayan, Himalayan1{

	
	public void DisplayCountry() {
		System.out.println("Nepal");
		
	}

	
	public void DisplayCity() {
		System.out.println("ktm");
		
	}

	
	public void save() {
		System.out.println("save method");
		
	}

	
	public void loan() {
		System.out.println("loan method");
		
	}

	
}