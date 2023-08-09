package test2;

import java.util.List;
import java.util.stream.Collectors;

public class Day38 {

	public static void main(String[] args) {
		
		
List<PersonMMM> peoplesss = List.of(
				
				new personPPP("ram sharma",20,"Baltimore"), new personPPP("shyam sharma",25,"catonsville"),
				
				new personPPP("arun sharma",35,"columbia"), new personPPP("adi sharma",37,"collsville"),
				
				new personPPP("abi sharma",32,"towson")	
		
				
	};

	List<PersonMMM> above30Age = peoplesss.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());

	System.out.println(above30Age);

	for(
	int i = 0;i<above30Age.size();i++)
	{
		System.out.println(above30Age.get(i).getAge);
		System.out.println(above30Age.get(i).getCity);
		System.out.println(above30Age.get(i)).getName);
	}

	// program 2:

	// Map and collect
	//

	List<String> names = peoplesss.stream().map(person -> person.getName()).collect(Collectors.toList());

	for(
	String nm:names)
	{
		System.out.println(nm);
	}

	// program 3:

	List<String> hhh = peoplesss.stream().map(person -> person.getName().concat(" : ").concat(person.getCity()))
			.collect(Collectors.toList());

	for(
	String nc:hhh)
	{
		System.out.println(nc);
	}
}}

class PersonMMM {

	private String name;
	private int age;
	private String city;

	public PersonMMM(String name, String city, int age) {
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

	}
}
