package test2;

public class trycatchfinally {	

	public static void main(String[] args) {
		
       //program 1:
		
		System.out.println("Hi");
		System.out.println(6/0);
		System.out.println("Welcome");
		
		//program 2:
		
	System.out.println("Hello");
		
		try {
			
			int divideByZero = 6/0;
		System.out.println("Rest of code in try block");
	
	}
			
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	System.out.println("Bye");	
		
	//program 3:
	
	System.out.println("Define a array with values");
	int []numbers = {15,25,35,45};
	
	try {
		System.out.println(numbers[0]);
		System.out.println(numbers[6]);
		
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
		
	System.out.println("Moving");
	
	//program 4:
	
	System.out.println("Define");
	try {
		int []numbers1 = {10,20,30,40};
		System.out.println(numbers1[6]);
		System.out.println(4/0);
		
	}
		
	catch(ArithmeticException e) {
		System.out.println("please");
		System.out.println(e.getMessage());
	}
		
	}	
}	
		
		
		
		
	
	

