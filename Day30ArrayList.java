package test2;

import java.util.ArrayList;

public class Day30ArrayList {

	public static void main(String[] args) {

		ArrayList<String> language = new ArrayList<>();

		language.add("java");
		language.add("python");
		language.add("javascript");
		language.add("c#");

		// retrive

		String w = language.get(0);
		String x = language.get(1);
		String y = language.get(2);
		String z = language.get(3);

		System.out.println(w);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		for(int s = 0; s < language.size();s++) {
			System.out.println(language.get(s));
			System.out.println(s);
		}
		//update the value of arraylist
		
		ArrayList<String> animals = new ArrayList<>();
		animals.add("cat");
		animals.add("Lion");
		animals.add("Dog");
		animals.add("Goat");
		System.out.println(animals);
		
		animals.set(3, "Cow");
		System.out.println(animals);
		
		animals.remove(2);
		System.out.println(animals);
		
		
		
		
		
		
		
		
		
		
		
	}

}
