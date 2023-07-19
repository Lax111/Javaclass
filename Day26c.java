package test2;

interface WBA {
	public void Save();

	public void Loan();
}

interface WBI{
	public void DisplayCountry();
	public void DisplayCity();
}
public class Day26c {

	public static void main(String[] args) {

		BankZ Dharan = new BankZ();
		Dharan.DisplayCity();
		Dharan.DisplayCountry();
		Dharan.Save();
		Dharan.Loan();
	
	}
}
//more than one interface can be implemented by class
class BankZ implements WBA, WBI{

	
	public void DisplayCountry() {
		System.out.println("this is Nepal");
		
	}

	
	public void DisplayCity() {
		System.out.println("Dharan");
		
	}

	
	public void Save() {
		System.out.println("Save method");
		
	}

	
	public void Loan() {
		System.out.println("Loan method");
		
		
	}}
