package test2;
interface USBankK{
public void Save(int a);
public void Loan(int b);
}
public class Day26a {

	public static void main(String[] args) {
		SBI USA = new SBI();
		USA.Loan(0);
		USA.Save(0);

		
		PNCs Maryland = new PNCs();
		Maryland.Loan(0);
		Maryland.Save(0);
	
	}
}
class SBI implements USBankK{

	
	public void Save(int a) {
	System.out.println("This is save method for SBI");
		
	}


	public void Loan(int b) {
		System.out.println("This is Loan method for SBI");
		
	}}

class PNCs implements USBankK{

	
	public void Save(int a) {
		System.out.println("This is Loan method for PNCs");
		
	}

	
	public void Loan(int b) {
		System.out.println("This is Loan method for PNCs");
		
	}
}







