package test2;

public class trycatch1 {

	public static void main(String[] args) {

 //        System.out.println("Hi");
//		 System.out.println(6/0);
	//	 System.out.println("Welcome");


		//System.out.println("Hello");
		//try {

			//int divideByZero = 7 / 0;

		//	System.out.println("code in try block");

		//} catch (ArithmeticException e) {

		//	System.out.println(e.getMessage());

		//}
		//System.out.println("Bye");

		System.out.println("Define a array with values");
		int []numbers = {15,25,35,45};
		
		try {
			System.out.println(numbers[0]);
			System.out.println(numbers[5]);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
		System.out.println("Moving");
		
		
		
		
		
		
		
	}

}
