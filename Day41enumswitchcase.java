package test2;

enum Sizezzz{
	
	SMALL, MEDIUM, LARGE, EXTRALARGE
}
	
class TestSize{
	
	Sizezzz Tshirt;
	
	public TestSize(Sizezzz tshirt) {
	this.Tshirt = tshirt;
	
}

public void buyTshirt() {
	switch(Tshirt) {
	
	case SMALL:
		System.out.println("small size");
		break;
	case MEDIUM:
		System.out.println("medium size");
		break;
	case LARGE:
		System.out.println("large size");
		break;
	case EXTRALARGE:
		System.out.println("extralarge size");
		break;
	default:
		System.out.println("anysize");
	
	}}
}


public class Day41enumswitchcase {

	public static void main(String[] args) {
	
		TestSize t = new TestSize(Sizezzz.EXTRALARGE);
		t.buyTshirt();
	
	}
	
}

