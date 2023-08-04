package test2;

public class Day25B {

	public static void main(String[] args) {
		
DogD DD = new DogD();
DD.makeSound();
DD.eat();
		
	}
}

abstract class AnimalAAA {

	abstract void makeSound();

	public void eat() {
		System.out.println("can eat");
	}
}

class DogD extends AnimalA {

	@Override
	void makeSound() {
		System.out.println("run run");
		// TODO Auto-generated method stub

	}

}