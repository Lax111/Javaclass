package test2;

import java.util.Arrays;
import java.util.List;

public class Day37 {

	public static void main(String[] args) {
		
	//Stream -API testing
		
		//count of blank strings
		
		List<String> name1 = Arrays.asList("ram","","shyam","hari","","gopal");
		System.out.println(name1.stream().filter(a -> a.isEmpty()).count());
		
		//taking the blank string to list
		
		List<String> name2 = Arrays.asList("saroj","","sri","saru","","shashi");
		System.out.println(name2.stream().filter(a -> a.isEmpty()).toList());
		
		//only the string
		
		List<String> name3 = Arrays.asList("sima","","ram","gopal","","shyam");
		System.out.println(name3.stream().filter(a -> !a.isEmpty()).toList());
		
		//names start with "S"
		
		List<String> name4 = Arrays.asList("sima","","ram","sabin","","shyam");
		System.out.println(name4.stream().filter(a -> a.contains("s")).toList());
		
		//string greater then 4
		List<String> name5 = Arrays.asList("sima","","ramya","sabin","","shyam");
		System.out.println(name5.stream().filter(a -> a.length() > 4).toList());
		
		// Working with every element of string
		
				// ["mary","shashi","abi"] --> //["MARY","SHASHI","ABI"]
				// ["mary","shashi","abi"] --> // ["mary","shashi"]
				
		
	
		List<Integer> transactions = Arrays.asList(200,-2900,67777,-800,-3700,89);
		
		
		System.out.println(transactions.stream().filter(tra -> tra > 0).toList());
		System.out.println(transactions.stream().filter(tra -> tra < 0).toList());

		
		
		//convert every list in map to Upper case()
		
		List<String> countries = Arrays.asList("USA","NEPAL","india", "china","london");
		System.out.println(countries.stream().map(a -> a.toUpperCase()).toList());
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(numbers.stream().map(a -> a * 2).toList());
		
		
		List<Integer> salary = Arrays.asList(5000,6000,7000,8000);
		System.out.println(numbers.stream().map(a -> a *2).toList());
		System.out.println(salary.stream().map(a -> a + a * 0.20).toList());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
