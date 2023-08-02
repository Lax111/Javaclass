//Abstract

package test2;

public class teststestsssss {

	public static void main(String[] args) {
		
		DogZ DDD = new DogZ()	;
		DDD.makeSound();
		DDD.eat();
		
}}



abstract class AnimalA{
	abstract void makeSound();
	
	public void eat() {
		System.out.println("can eat");
	}
}

class DogZ extends AnimalA{

	
	void makeSound() {
		System.out.println("run run");
	


	
	}}
	
	
	
	