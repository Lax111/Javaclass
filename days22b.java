package test2;

public class days22b {

	public static void main(String[] args) {
	
		SBII pune = new SBII("India", "Pune");
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
			this.branchName = bn;
			
		}
			

	public void save()	{
		System.out.println("save");
	}

	public void loan() {
		System.out.println("loan");
	}
		
	}	
	class SBII extends WorldBank1 {

		String branchName;
		
		public SBII(String cnt,String bn) {
			super(cnt);
			this.branchName = bn;
		}
		
	}
		
		
		
		
		
			
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
