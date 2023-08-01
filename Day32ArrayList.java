package test2;

import java.util.ArrayList;

public class Day32ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		//add()
		
		boolean a = names.add("Kris");
		System.out.println(a);
		
		names.add("ram");
		names.add("shyam");
		names.add("Govinda");
		names.add("nara");
		names.add("hari");
		System.out.println(names);
		
		//add(position, element)
		
		names.add(3,"madhav" );
		System.out.println(names);
		
		//remove
		
		names.remove(2);
		System.out.println(names);
		names.remove("nara");
		System.out.println(names);
		
		//clear()
		
		names.clear();
		System.out.println(names);
		names.add("abi");
		names.add("ram");
		names.add("saroj");
		names.add("adi");
		System.out.println(names);
		
		//set()
		
		names.set(2, "shyam");
		System.out.println(names);
		
		//contains()
		
		boolean q1 = names.contains("adi");
		System.out.println(q1);
		
		//get()
		
		String eleAtIndex2 = names.get(3);
		System.out.println(eleAtIndex2);
		
		//indexOf()
		
		int nums = names.indexOf("ram");
		System.out.println(nums);
		
		int numsZ = names.indexOf("ram");
		System.out.println(numsZ);
		
		ArrayList<String> vegi = new ArrayList<>();
		vegi.add("tomato");
		vegi.add("potato");
		vegi.add("cauli");
		vegi.add("carrot");
		System.out.println(vegi);
		
		
		String userInput = "tomato";
		if(vegi.contains(userInput)) {
			System.out.println("Element available");
		}
		else {		
			System.out.println("Element available");
		}
		//indexOf()
		
		if(vegi.indexOf("tomato")>=0) {
			System.out.println("Element available");
		}
		else {
			System.out.println("Element not available");
		}
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("maryland");
		cities.add("virginia");
		cities.add("columbia");
		cities.add("new york");
		
		System.out.println(cities.size());
		System.out.println(cities);
		
		//
		
		System.out.println(cities.indexOf("virginia"));
		System.out.println(cities.lastIndexOf("new york"));
		
		
		
		
		
		
	}

}
