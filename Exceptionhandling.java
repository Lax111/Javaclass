package test2;

public class Exceptionhandling {

	public static void main(String[] args) {

		// program 1:

		/*
		 * System.out.println("Hi"); System.out.println(6/0);
		 */System.out.println("Welcome");

		// program 2:

		System.out.println("Hello");
		try {

			int divideByZero = 7 / 0;

			System.out.println("code in try block");

		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());

		}
		System.out.println("Bye");

		// program 3:

		System.out.println("Define a array with values");
		int[] num = { 10, 20, 30, 40 };
		try {
			System.out.println(num[0]);
			System.out.println(num[6]);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		System.out.println("Moving ahead after managing the exception");

		// program 4:

		System.out.println("Define a array with values");
		int[] nums = { 12, 22, 32, 42 };

		try {
			System.out.println(nums[0]);
			System.out.println(nums[7]);
			System.out.println(6 / 0);
		}

		catch (ArithmeticException e) {
			System.out.println("please enter your valid index");
			System.out.println(e.getMessage());
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter your valid index for a array");
			System.out.println(e.getMessage());

		}

		catch (Exception e) {
			System.out.println("Exception handled sucessfully");
		}

		System.out.println("Moving ahead after managing the execption");

           //Program 5:

		System.out.println("Hi");
		
		try {
			System.out.println(6/6);
		}
		catch(Exception e){
			System.out.println("Exception managed sucessfully");
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
		finally {
			System.out.println("I will be executed anyhow");
		}
	}

}
