package test2;

public class days22b {

	public static void main(String[] args) {
	
		SBI pune = new SBI("India", "Pune");
		pune.loan();
		pune.save();
		pune.displayMessage();
	}

}
class WorldBank1 {
	String country;
	
	//constructor
	public WorldBank1(String cnt) {
		this.country = cnt;
		
	}
	
	public void save() {
		System.out.println("save");
	}
	
	public void loan() {
	System.out.println("loan");
	
	}
	
	public void displayMessage() {
	System.out.println("Welcome to worldBank");
	
	}
	}

	class PNB extends WorldBank1 {
		
String branchName;
		
		public PNB(String cnt , String bn) {
			super(cnt);
			
		}
			

	public void save()	{
		System.out.println("save");
	}

	public void loan() {
		System.out.println("loan");
	}
		
	}	
	class SBI extends WorldBank1 {

		String branchName;
		
		public SBI(String cnt,String bn) {
			super(cnt);
			this.branchName = bn;
		}
		
	}
		
		
		
		
		
			
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
