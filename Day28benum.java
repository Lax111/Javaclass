package test2;

enum size{
	SMALL, MEDIUM, LARGE, EXTRALARGE
}
class Order{
	size pizzaSize;
	
	public Order(size pizzaSize) {
	this.pizzaSize = pizzaSize;
	}
	
	public void orderConfirmation() {
		
		switch (pizzaSize) {
		
		case SMALL:
			System.out.println("you have ordered small size pizza");
			break;
		
		case MEDIUM:
			System.out.println("you have ordered medium size pizza");
			break;
		
		
		case LARGE:
			System.out.println("you have ordered large size pizza");
			break;
		
		
		case EXTRALARGE:
			System.out.println("you have ordered extraLarge size pizza");
			break;
		}
		
		}
	}

public class Day28benum {

	public static void main(String[] args) {
		Order order = new Order(size.MEDIUM);
		order.orderConfirmation();

	}

}
