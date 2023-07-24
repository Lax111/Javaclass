package test2;

interface USAQBank {

	public void loan(int s);

	public void save(int t);

}

public class examqq5 {

	public static void main(String[] args) {

		Chase USAQ = new Chase();
		USAQ.loan(0);
		USAQ.save(0);

		PNBQQ Catonsville = new PNBQQ();
		Catonsville.loan(0);
		Catonsville.save(0);
	}

}

class Chase implements USAQBank {

	public void loan(int s) {
		System.out.println("loan method for chase");

	}

	public void save(int t) {
		System.out.println("save method for chase");

	}
}

class PNBQQ implements USAQBank {

	public void loan(int s) {
		System.out.println("loan method for PNBQQ");

	}

	public void save(int t) {
		System.out.println("save method for PNBQQ");

	}

}
