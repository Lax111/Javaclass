package test2;
//multiple interface implement 
interface Three {
	public void methodThree();
}

interface Four {
	public void methodFour();
}

interface Five {
	public void methodFive();

}

public class Day26d {

	public static void main(String[] args) {

	Seven objSeven = new Seven();
	objSeven.SixA();
	objSeven.SixB();
	objSeven.methodFour();
	objSeven.methodThree();
	objSeven.methodFive();	
			}  

}
class Six{
	public void SixA() {
		System.out.println("This is first method for class six");
	}
	
	public void SixB() {
		System.out.println("This is Second method for class six");
	}}
	
class Seven extends Six implements Three,Four,Five{

	
	public void methodFour() {
		System.out.println("This is the method from interface four");
		
	}
	public void methodThree() {
		System.out.println("This is the method from interface four");
		
	}
	public void methodFive() {
		System.out.println("from five");
		
	}
}








