package test2;

public class Day27aa {

	public static void main(String[] args) {
		CPU1 i5 = new CPU1();
		System.out.println(i5.price);

		int priceD = i5.displayPrice();
		System.out.println(priceD);

}
}
class CPU1 {
	int price = 200;

	class Processor {
		String manufacturer = "intel";

		public String speed() {
			return "fast";
		}
	}

	public int displayPrice() {
		return this.price;
	}}


	


