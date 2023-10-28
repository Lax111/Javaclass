package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonCC {

	public static void main(String[] args) {
		
		
		//("sima","shashi","nisha","sanvi","sarita");
		List<PersonB> people = new ArrayList<>();
		people.add(new PersonB("sima","khanal",43));
		people.add(new PersonB("shashi","acharya",34));
		people.add(new PersonB("nisha","chapagain",25));
		people.add(new PersonB("sanvi","acharya",12));
		people.add(new PersonB("nisha","chapagin",32));
		
		//program 1
		// Filtering : Get people older than 30
		
		List<PersonB> above30 = people.stream().filter(x->x.getAge()>30).collect(Collectors.toList());
		
		above30.forEach(x->System.out.println(x.displayName()));
		
		//program 2
		// Filtering based on name : "Mayuri"
		
		List<PersonB> filterOnName = people.stream().filter(x->x.displayName().contains("nisha")).collect(Collectors.toList());
		
		filterOnName.forEach(x->System.out.println(x.displayName()));
		
		
		//program 3
		  // Collecting only the names in one list
		
		List<String> names= people.stream().map(x->x.firstName).collect(Collectors.toList());
		names.forEach(x->System.out.println(x));
		
		//program 4
		List<Integer> ages = people.stream().map(x->x.age).collect(Collectors.toList());
		int sum = ages.stream().reduce(0,(x,y)->x+y);
		System.out.println(sum/people.size());
		
		int avg = people.stream().map(x->x.age).collect(Collectors.toList()).stream().reduce(0,(x,y)->x+y)/people.size();
		
		
		
		
		// Sorting the people in ascending by their age 
		  
		List<PersonB> sortedByAge = people.stream().sorted (Comparator.comparing(PersonB::getAge)).collect(Collectors.toList());
		  
		  // count the number of people with same age
		
		 Map<Integer, Long> ageCountMap = people.stream()
	                .collect(Collectors.groupingBy(PersonB::getAge, Collectors.counting()));
		 ageCountMap.forEach((age, count) -> System.out.println("Age " + age + ": " + count + " people"));
		 
		  // name of first 3 people where age > 30
		 
		 List<PersonB> first3Above30 = people.stream()
	                .filter(PersonB -> PersonB.getAge() > 30)
	                .limit(3).collect(Collectors.toList());
		 first3Above30.forEach(PersonB->System.out.println(PersonB.displayName()));
		 
		  // distinct name list 
		  
		 List<String> distinctNames = people.stream()
	                .map(PersonB-> PersonB.firstName)
	                .distinct()
	                .collect(Collectors.toList());
		 distinctNames.forEach(name -> System.out.println(name));
			
		
	}}	
	class PersonB{
		String firstName;
		String lastName;
		int age;
		
		public PersonB(String fn, String ln,int ag){
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}
		
		public String displayName() {
			return(this.firstName+this.lastName);
		}
		public int getAge() {
			return this.age;
		}
	}
