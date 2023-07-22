package test2;

public class Day25B{

	public static void main(String[] args) {

		Dogs D = new Dogs();
		D.makesound();
		D.eat();
	}
}

abstract class AnimalSS {
	abstract void makesound();

	public void eat() {
		System.out.println("i can eat");
	}
}

class Dogs extends AnimalSS {

	public void makesound() {
		System.out.println("bark bark");
	}
}