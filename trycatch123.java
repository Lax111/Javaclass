package test2;

public class trycatch123 {

	public static void main(String[] args) {
		
		int[] kathmandu = {10,20,30,40};
		System.out.println(kathmandu[4]);

	
try {
	int[] kathmandu2 = {20,30,40,50};
	System.out.println(kathmandu2[4]);
	
}	
catch(Exception e){
	System.out.println("please");
	System.out.println(e.getMessage());
	
	
	
}
	
	
	
}
}