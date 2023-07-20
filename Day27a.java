package test2;

public class Day27a {

	public static void main(String[] args) {

		CPU i5 = new CPU();
		System.out.println(i5.price);

		int priceD = i5.displayPrice();
		System.out.println(priceD);

	}

}

class CPU {
	int price = 200;

	class Processor {
		String manufacturer = "intel";

		public String speed() {
			return "fast";
		}
	}

	public int displayPrice() {
		return this.price;
	}
}
