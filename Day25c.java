package test2;

public class Day25c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CarCC honda = new CarCC(1);
		System.out.println(honda.wheel);
		honda.brake();
	}

}

abstract class vehicleEE {
	
	int wheel;
	
	public vehicleEE(int w) {
		this.wheel = w;
	}
	abstract public void brake();
}

class CarCC extends vehicleEE {
	
	public CarCC(int w) {
		super(w);
	}
	public void brake() {
		System.out.println("I am brake for CarCC");
	}
	
	
}