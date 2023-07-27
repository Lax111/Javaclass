package test2;

enum Sizes{
	SMALL, MEDIUM, LARGE, EXTRALARGE
}

class OrderQQ{
	Sizes dressSiza;
	
	public OrderQQ(Sizes dressSiza) {
		this.dressSiza = dressSiza;
	}
	public void orderConnection() {
		
		switch (dressSiza) {
		
		case SMALL:
			System.out.println("you have ordered a small size dress");
			break;
			
		case MEDIUM:
			System.out.println("you have ordered a medium size dress");
			break;
			
		case LARGE:
			System.out.println("you have ordered a large size dress");
			break;
			
		case EXTRALARGE:
			System.out.println("you have ordered a extra large size dress");
			break;
		}
	}	
}

public class enumpracs {

	public static void main(String[] args) {
		OrderQQ OrderQQ = new OrderQQ(Sizes.MEDIUM);
		OrderQQ.orderConnection();

	}

}
