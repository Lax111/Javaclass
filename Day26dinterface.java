package test2;

interface Three55 {
	public void methosThree();
	
}
interface Four55 {
	public void methosFour();
}

interface Five55 {
	public void methosFive();
	
}

public class Day26dinterface {

	public static void main(String[] args) {
		
		SevenZZ num = new SevenZZ();
		num.SixB();
		num.SixC();
		num.methosFour();
		num.methosThree();
	}

}

class SixA {
	

	public void SixB() {
		System.out.println("Class first Six");
	}

	public void SixC() {
		System.out.println("Class  second Six");
	}
}

class SevenZZ extends SixA implements Three55,Four55 {

	
	public void methosFour() {
		System.out.println("this is four");
		
	}

	
	public void methosThree() {
	System.out.println("this is five");	
	}	
	}








