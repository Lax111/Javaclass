package test2;

import test2.Car.Engine;

public class examqq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



	Car Honda = new Car("Turing", "Honda");
	Car Toyota = new Car("corala", "Suv");
	
	
	CarZ.EngineQQ s = Honda.new EngineQQ();
	CarZ.EngineQQ t = Toyota.new EngineQQ();
	
	s.engineSize();
	t.engineSize();
}

}

class CarZ {
String CarName;
String CarType;

public CarZ(String name, String type) {
	this.CarName = name;
	this.CarType = type;
}

public void Greet() {
	System.out.println("Congrat".concat(this.CarName));
}

// inner class

class EngineQQ {
	String engineSize;

	// Accessing the outer class fields into inner class

	public void engineSize() {

		if (CarZ.this.CarType.equals("sedane")) {
			this.engineSize = "small";
			System.out.println(this.engineSize);
		} else if (CarZ.this.CarType.equals("SUV")) {
			this.engineSize = "large";
			System.out.println(this.engineSize);
		}

	}}}


