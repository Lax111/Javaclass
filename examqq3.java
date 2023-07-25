package test2;

import test2.Car.Engine;

public class examqq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarZ Honda = new CarZ("Turing", "Honda");
		CarZ Toyota = new CarZ("corala", "Suv");

		// CarZ.EngineZZZ s = Honda.new();
		// CarZ.EngineZZZ t = Toyota.new EngineZZZ();

		CarZ.EngineAAA s = Honda.new EngineAAA();
		CarZ.EngineAAA t = Toyota.new EngineAAA();

		// s.engineSize();
		// t.engineSize();
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

	class EngineAAA {
		String engineSize;

		// Accessing the outer class fields into inner class

		public void engineSize() {

			if (CarZ.this.CarType.equals("sedane")) {
				this.engineSize = "small";
				
				System.out.println(this.engineSize);
			
			}else if (CarZ.this.CarType.equals("SUV")) {
				this.engineSize = "large";
				System.out.println(this.engineSize);
			}

		}
	}
}
