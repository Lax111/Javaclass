//Arraylist with loop

package test2;

import java.util.ArrayList;

public class Arraylistwithloop {

	public static void main(String[] args) {

	ArrayList<Integer> numbers = new ArrayList <>();
	
	numbers.add(100);
	numbers.add(200);
	numbers.add(300);
	numbers.add(400);
	numbers.add(500);
		
		System.out.println("access elements");
		
		//Accessing elements using a for loop
		
		for(int a = 0; a < numbers.size(); a++) {
			int number = numbers.get(a);			
			System.out.println(number);
			System.out.println(a);
		}
		//Modifying elements using a for loop
		
		for (int s =0; s < numbers.size();s++) {
			int number1 = numbers.get(s)*2;
			numbers.set(s, number1);
			System.out.println("modifying element");
		}
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
		
		
	}
}
