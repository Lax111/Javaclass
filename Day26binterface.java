package test2;

class X {
	public void Math() {
		System.out.println("Add");
	}
}
class Y {
	public void Math1() {
		System.out.println("SUBS");
	
	}}

class Z extends X{
}
	
public class Day26binterface {

	public static void main(String[] args) {
		Z calculator = new Z();
		calculator.Math();

	}

}
