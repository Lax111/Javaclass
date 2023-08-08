package test2;

interface WorldBank{
	
	public void loan(int a);
	
	public void save(int b);
}
public class interface2000 {

	public static void main(String[] args) {
		
		NRBZ usa = new NRBZ();
		usa.loan(0);
		usa.save(0);
		
		NBBZ maryland = new NBBZ();
		maryland.loan(0);
		maryland.save(0);
			
	}
}
class NRBZ implements WorldBank{

	
	public void loan(int a) {
		System.out.println("loan from nrbz");
		
	}

	public void save(int b) {
		System.out.println("save from nrbz");
		
	}	
}
class NBBZ implements WorldBank{

	
	public void loan(int a) {
		System.out.println("loan from nbbz");
		
	}
	public void save(int b) {
		System.out.println("save from nbbz");
		
	}
	
}







