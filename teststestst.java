//interface

package test2;
interface USABank{
	public void loan(int s);
	public void save(int y);
}
public class teststestst {

	public static void main(String[] args) {

		NRBR NNN = new NRBR();
		NNN.loan(0);
		NNN.save(0);
		
		NBBB BBB = new NBBB();
		BBB.loan(0);
		BBB.save(0);
	}
}

class NRBR implements USABank{

	
	public void loan(int s) {
		System.out.println("loan from nrbr");
		
	}

	
	public void save(int y) {
		System.out.println("save from nrbr");
		
	}}	

	class NBBB implements USABank{

		
		public void loan(int s) {
			System.out.println("loan from nbbb");
			
		}

		
		public void save(int y) {
			System.out.println("save from nbbb");
			
		}	
		
	}
		
		
		
		
		
		
	