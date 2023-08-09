package test2;

import java.util.List;
import java.util.stream.Collectors;

public class Day38person {

	public static void main(String[] args) {
		
		
		//List<personPPP> peoples = (List.of(
	
				//new personPPP("ram sharma",20,"Baltimore"),
		
				//new personPPP("shyam sharma",25,"catonsville"),
				
				//new personPPP("arun sharma",35,"columbia"),
				
				//new personPPP("adi sharma",35,"collsville"),
				
				//new personPPP("abi sharma",35,"towson")
				
		List<personPPP> peoples = List.of(
				new personPPP("ram sharma",20,"Baltimore"),
				
				/new personPPP("shyam sharma",25,"catonsville"),
				
				/new personPPP("arun sharma",35,"columbia"),
				
				new personPPP("adi sharma",37,"collsville"),
				
				new personPPP("abi sharma",32,"towson")	
		
				
	};

	List<personPPP>above30Age = Peoples.stream().filter(person -> person.getAge()> 30).collect(Collectors.toList());
	
	
	system.out.println(above30Age);
	
	for(int i = 0; i < above30Age.size(); i++) {
		System.out.println(above30Age(i).getAge);
		System.out.println(above30Age(i).getCity);
		System.out.println(above30Age(i).getName);
	}
	
	// program 2:
	
	//Map and collect
	//
	
	List<String> names = People.stream().map(Person.getName().collect(Collectors.toList()));
	
	for(String nm:names) {
		System.out.println(nm);
		
		
		//program 3:
		
		List<String> hhh = 
				peoples.stream()
				.map(person -> person.getName()
						.contact(Person.getCity())))
				.collect(Collectors.toList());
		
		for(String nc : hhh) {
			System.out.println(nc);
		}
	}
}

class personPPP{
	
	private String name;
	private int age;
	private String city;
	
	public personPPP(String name, String city,int age){
		this.name = name;
		this.age = age;
		this.city = city;
		
	}
	
	public String getName() {
		return name;
	
}
	public String getCity() {
	return name;
	
	}
	
	public String getAge() {
	return city;
	
}}



