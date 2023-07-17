package test2;

public class Day13 {

	public static void main(String[] args) {
		
		
		//program  1
		
			//type [] nameOfArray = new type[lengthOfarray]
			// Array stores the value by index
			
			int [] numbers = new int[5];
			numbers[0] = 11;
			numbers[1] = 22;
			numbers[2] = 33;
			numbers[3] = 44;
			numbers[4] = 55;
			
			
			System.out.println(numbers[0]);
			System.out.println(numbers[1]);
			System.out.println(numbers[2]);
			System.out.println(numbers[3]);
			System.out.println(numbers[4]);
			
			
			int [] numbers2 = {111,222,333,444,555};
			System.out.println(numbers2[0]);
			System.out.println(numbers2[1]);
			System.out.println(numbers2[2]);
			System.out.println(numbers2[3]);
			System.out.println(numbers2[4]);
			
			
			// program 2
			
			String [] cities = new String [5];
			
			cities[0] = "pune";
			cities[1] = "mumbai";
			cities[2] = "banglore";
			cities[3] = "kolkata";
			cities[4] = "chennai";
			
			//System.out.println(cities[0]);
			
			// looping through array
			
			for(int i = 0 ; i < cities.length ; i++) { 
				System.out.println(i); 
				System.out.println(cities[i]);
				
			}
			
			// i ---- 0
			// i ---- 1
			// i ---- 2
			// i ---- 3
			// i ---- 4
			
			//               0  1   2  3   4   5
			int [] marks = {99,100,111,23,45, 55};
			
			for(int i = 0 ; i < marks.length ; i++) {
				System.out.println(marks[i]);
			}
			
			System.out.println("Reverse ------------");
			
			for(int i = marks.length -1 ; i >= 0 ; i-- ) {
				System.out.println(marks[i]);
			}
			
			
			// program 3
			
			int mks [] = {33,44,55,66,77,88,99};
			
			int t1 = 0;
			
			while(t1 < mks.length) {
				System.out.println(mks[t1]);
				t1 = t1 + 1;
			}
			
			
			
			int t2 = mks.length -1 ;
			while(t2 >= 0) {
				System.out.println(mks[t2]);
				t2 = t2 - 1;
			}
			
			
			// program 4 (for each loop)
			
			String [] fruits = {"apple","grapes","banana"};
			int [] mks2 = {11,22,33};
		
			for(String a :fruits) {
				System.out.println(a);
			}
			
			for(int b :mks2) {
				System.out.println(b);
			}
			
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
