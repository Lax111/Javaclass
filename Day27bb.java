package test2;

import test2.Car1.Engine;

public class Day27bb {

	public static void main(String[] args) {
		Car1 audi = new Car1("Q4", "sedane");
		Car1 Thar = new Car1("XU700", "SUV");
		
		
		Car1.Engine s = audi.new Engine();
		Car1.Engine t = Thar.new Engine();
		
		s.engineSize();
		t.engineSize();
	}

}

class Car1 {
	String CarName;
	String CarType;

	public Car1(String name, String type) {
		this.CarName = name;
		this.CarType = type;
	}

	public void Greet() {
		System.out.println("Congratulation on your new car".concat(this.CarName));
	}

	// inner class

	class Engine {
		String engineSize;

		// Accessing the outer class fields into inner class

		public void engineSize() {

			if (Car1.this.CarType.equals("sedane")) {
				this.engineSize = "smaller";
				System.out.println(this.engineSize);
			} else if (Car1.this.CarType.equals("SUV")) {
				this.engineSize = "bigger";
				System.out.println(this.engineSize);
			}

		}}
	}



	


