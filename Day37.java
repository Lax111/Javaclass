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
		System.out.println(name2.stream().filter(a -> a.isEmpty()).count());
		
		//only the string
		
		List<String> name3 = Arrays.asList("sima","","ram","gopal","","shyam");
		System.out.println(name3.stream().filter(a -> !a.isEmpty()).toList());
		
		//names start with "S"
		
		List<String> name4 = Arrays.asList("sima","","ram","sabin","","shyam");
		System.out.println(name4.stream().filter(a -> a.contains("s")).toList());
		
		//string greater then 4
		List<String> name5 = Arrays.asList("sima","","ramya","sabin","","shyam");
		System.out.println(name5.stream().filter(a -> a.length() > 4).toList());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
