//Laxmi chapagain


package test2;

public class Day23a {

	public static void main(String[] args) {
			
		Dog d = new Dog();
		d.displayMessage();
		
	}
}
//use of super keyword in java

class Animal {
	
	public void display() {
		System.out.println("I have an animal");
	}
}
class Dog extends Animal {
	
	public void display() {
		System.out.println("I have a Dog");
		
	}
	
	public void displayMessage() {
		display();
		super.display();
	}
	
	
}