//abstract 

package test2;

public class testtesttest {

	public static void main(String[] args) {

		CarC honda = new CarC("red");
		System.out.println(honda.color);
		honda.Model();
	}
}

abstract class VehicleV {
	String color;

	public VehicleV(String col) {
		this.color = col;
	}

	abstract public void Model();

}

class CarC extends VehicleV {

	public CarC(String col) {
		super(col);

	}

	public void Model() {
		System.out.println("model for CarC");

	}

}