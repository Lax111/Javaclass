package test2;

interface WorldBankZ{
	
	public void loan(int a);
	
	public void save(int b);
}

public class interface108 {

	public static void main(String[] args) {
		
		BBQ BBB = new BBQ();
		BBB.save(0);
		BBB.loan(0);
		
		NCC NNN = new NCC();
		NNN.save(0);
		NNN.loan(0);
	}

}

class BBQ implements WorldBankZ{

	@Override
	public void loan(int a) {
		System.out.println("loan from bbq");
		
	}

	@Override
	public void save(int b) {
		System.out.println("save from bbq");
		
	}
	
}

class NCC implements WorldBankZ{

	@Override
	public void loan(int a) {
		System.out.println("loan from ncc");
		
	}

	@Override
	public void save(int b) {
		System.out.println("save from ncc");
		
	}
	
}










