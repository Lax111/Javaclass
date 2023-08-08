package test2;

public class trycatch2000 {

	public static void main(String[] args) {
		
		//program 1:
		
//		System.out.println("hello");
//		System.out.println(5/0);
//		//System.out.println("bye");
//		
		//program 1:
		
//		System.out.println("hi");
//		
//		try {
//			int devideByZero= 5/0;
//			System.out.println("try block code");
//	
//		}
//		
//		catch(ArithmeticException e){
//			
//			System.out.println(e.getMessage());
//			
			
		//}
		
		//program 3:
		
//		System.out.println("define array with values");
//		
//		int []numbers = {10,20,30,40};
//		
//		try {
//			System.out.println[0];
//			System.out.println[5];
//		}
//		
//		catch(Exception e){
//			
//			System.out.println(e.getMessage());
//		
//	}
//		
//		System.out.println("moving ahead after managing the exception");
//	
		//program 4:
		
		System.out.println("Define a array with values");
		int [] numbers = {10,20,30,40};
		
		try {
			System.out.println(numbers[0]);
			System.out.println(numbers[5]);
			System.out.println(5/0);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			
		//                                                                  }
		//catch(ArrayIndexOutOfBoundsException e){
			//System.out.println("enter valid input");
			//System.out.println(e.getMessage());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
