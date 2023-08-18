package test2;

class MyException extends Exception{
	
	public MyException(String s) {
super(s);

}
}

class InvalidMobileNumber extends Exception{
	
	public InvalidMobileNumber(String s) {
		super(s);
	}
}	
public class Main {

	public static void main(String[] args) {
		
	try {
		
		String password = "rtyrytyutuyuiyu";
		if(password.length()<= 8) {
			throw new MyException("password length is small");
		}
		
		String mobile = "fgfhfhffgh";
		if(mobile.length()<= 10) {
			throw new MyException("please enter valid mobile number");
		}
		
		System.out.println("user register");
	}
	catch(Exception e) {
	
		System.out.println("function called");
		System.out.println("caugh");
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	}

}

	
