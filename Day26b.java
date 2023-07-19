package test2;

class A {
	public void GreetA() {
		System.out.println("Hello");
	}
}

class B {
	public void GreetB() {
		System.out.println("See you");
	}
}

//only one class can be inherited in the child class
class C extends A{
}
public class Day26b {

	public static void main(String[] args) {

		C Apple = new C();
		Apple.GreetA();
	}

}
