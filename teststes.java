package test2;

public class teststes {

	public static void main(String[] args) {
		
		//program 1:
			
		int [] numbers = new int[5];
		
		numbers[0]= 10;
		numbers[1]= 20;
		numbers[2]= 30;
		numbers[3]= 40;
		numbers[4]= 50;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		
		int [] number2 = {100,200,300,400,500};
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		//program 2:
		
		String [] cities = new String[5];
		cities[0]= "Maryland";
		cities[1]= "Colunbia";
		cities[2]= "Virginia";
		cities[3]= "New york";
		cities[4]= "Boston";
		
		System.out.println(cities[0]);
	//	for loop (looping through array)
		
		for(int a = 0;a <cities.length; a++) {
		System.out.println(a);
		System.out.println(cities[a]);
		
		
		
		
		
	}
	}
}
