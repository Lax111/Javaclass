package test2;

public class monss {

	public static void main(String[] args) {
		

	


//calling the shop1 function 	

		ShopA();
		
		//calling the shopB function
		
		ShopB(20,10);
		
		//calling the shopC function
		
		int AAA = ShopC(100,50);
		System.out.println(AAA);
	}

	
	
	// Writing a function without parameter and without return type

	public static void ShopA() {
		System.out.println(100+100);
		
		System.out.println(200-100);
		
	}
	
	// Writing a function with parameter and without return type

	public static void ShopB(int e, int f) {
		System.out.println(e+f);
		
		System.out.println(e-f);
	
	}
	// Writing a function with parameter and with return type
		
		public static int ShopC(int s, int t) {
		return s+t;
		
		}
		
		public static int ShopD(int p, int q) {
			return p-q;
		
}
}
