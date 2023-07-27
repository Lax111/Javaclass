package test2;

public class ExxceptionhandlingTryCatch {

	public static void main(String[] args) {

		try {

			int a = 20;
			System.out.println("Before division");
			System.out.println(a / 0);
			System.out.println("After division");

		} catch (Throwable t) {

			System.out.println(t.getMessage());
			System.out.println(t.getCause());
			System.out.println(t.getStackTrace());
			t.printStackTrace();
		}
		
		finally {		
		System.out.println("this is finally block");
		}
		
		System.out.println("After division");
	}

}
