package test2;

public class day39instanceof {

	public static void main(String[] args) {
		

	Dog1 d1 = new Dog1();
	
	System.out.println(d1 instanceof Dog1);
		System.out.println(d1 instanceof AnimalAA);
		
	
		Invoice inv = new Invoice ("123","lax","chapagain","1234567897","21228");
		System.out.println(inv instanceof Invoice);
		
	}

}

class AnimalAA {
		
}

class Dog1 extends AnimalAA {
}	
	
class Invoice {
	
	String billNo;
	String firstName;
	String lastName;
	String phoneNo;
	String address;
	
	
	public Invoice(String bn,String fn, String ln,String phoneNo, String address) {
	this.billNo = "123";
	this.firstName = "lax";
	this.lastName = "chapagain";
	this.phoneNo = "1234567897";
	this.address = "21228";
	
	}
}
