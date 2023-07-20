package test2;

public class Day27b {

	public static void main(String[] args) {

		Car audi = new Car("Q4", "sedane");
		Car Thar = new Car("XU700", "SUV");
		
		
		Car.Engine s = audi.new Engine();
		Car.Engine t = Thar.new Engine();
		
		s.engineSize();
		t.engineSize();
	}

}

class Car {
	String CarName;
	String CarType;

	public Car(String name, String type) {
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

			if (Car.this.CarType.equals("sedane")) {
				this.engineSize = "smaller";
				System.out.println(this.engineSize);
			} else if (Car.this.CarType.equals("SUV")) {
				this.engineSize = "bigger";
				System.out.println(this.engineSize);
			}

		}
	}

}