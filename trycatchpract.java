package test2;

public class trycatchpract {

	public static void main(String[] args) {
		
		/*program 1:
		
		//System.out.println("Hello");
		//System.out.println(5/0);
		//System.out.println("bye");
		
		//program 2:
		
		//System.out.println("Hello");
	
		//try {
		//	int divideByZero = (5/0);
			//System.out.println("Rest of code in try block");
		//	System.out.println("Rest of code in try block2");
		//	System.out.println("Rest of code in try block3");
		//	System.out.println("Rest of code in try block4");	
		}
		//catch(ArithmeticException e) {	
		
		//System.out.println(e.getMessage());
			
		//}
		*///System.out.println("bye bye");
		
		//program 3:
	
		/*System.out.println("Define a array with values");
		
		int []numbers = {10,20,30,40};
		
		try {
			
			System.out.println(numbers[0]);
			System.out.println(numbers[5]);
			
		}
		catch(Exception e){
	           System.out.println(e.getMessage());
		}
		*///System.out.println("moving ahead");
	
		
		//program 4:
		
	/*System.out.println("Define a array with values");
	
	int []nums3 = {20,30,40,50};
		
	try {
		
		System.out.println(nums3[0]);
		System.out.println(nums3[5]);
		System.out.println(nums3[5/0]);
	}
	catch(ArithmeticException e){
		System.out.println("valid input");
		System.out.println(e.getMessage());
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("valid index");
		System.out.println(e.getMessage());
		
	}
	catch(Exception e) {
		System.out.println("Execution handled successfully");
	}
	*///System.out.println("managing the exection");
	
	//program 5:
	
	System.out.println("hello");
	
	try {
	
	System.out.println(5/5);
	
	}
	catch(Exception e) {
		
		System.out.println("Exception managed successfully");
		String msg = e.getMessage();
		System.out.println(msg);
	}
	
	finally {
		System.out.println("i will be ");
	}
	}
	
	
			
	
}
	
		
		

