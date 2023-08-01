package test2;

enum SizeSSS{
	SMALL, MEDIUM, LARGE, EXTRALARGE
}

class OrderDDD{
	SizeSSS pizzasize;
	
	public OrderDDD(SizeSSS pizzasize) {
		this.pizzasize = pizzasize;
	}
	
	public void getConformation() {
		switch(pizzasize) {
		
		case SMALL:
			System.out.println("size of pizza is small");
		break;
		
		case MEDIUM:
			System.out.println("size of pizza is medium");
		break;
		
		
		case LARGE:
			System.out.println("size of pizza is large");
		break;
		
		case EXTRALARGE:
			System.out.println("size of pizza is extralarge");
		break;	
			
		}
	}
}

public class day29b {

	public static void main(String[] args) {
		
		OrderDDD order  = new OrderDDD(SizeSSS.MEDIUM);
		order.getConformation();
	}

}
