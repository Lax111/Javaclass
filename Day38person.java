package test2;

import java.util.List;
import java.util.stream.Collectors;

public class Day38person {

	public static void main(String[] args) {
		List<PersonS> peoples = List.of(

				new PersonS("ram sharma", 24, "baltimore"), 
				new PersonS("sarita sharma", 24, "catonsville"),
				new PersonS("saroj sharma", 35, "columbia"),
				new PersonS("sabira", 23, "towson"),
				new PersonS("rome sharma", 34, "collsville")

		);

		List<PersonS> above30Age = peoples.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());

		System.out.println(above30Age);

		for (int i = 0; i < above30Age.size(); i++) {
			System.out.println(above30Age.get(i).getAge());
			System.out.println(above30Age.get(i).getCity());
			System.out.println(above30Age.get(i).getName());
		}

		
		// program 2
		
	
		// Map and collect
		// ["mayuri sorte","amol rao","chinmay deshpande","manasi rao", "sarika pasare"]

		List<String> names = peoples.stream().map(person -> person.getName()).collect(Collectors.toList());
		
		for(String nm:names) {
			System.out.println(nm);
		}
		
		// Program 3
		// Person and city
		//"mayuri rao:pune"
		List<String> hhh = 
				peoples.stream()
				.map(person -> person.getName()
						.concat(" :")
						.concat(person.getCity()))
				.collect(Collectors.toList());
		
		
		for(String nc:hhh) {
			System.out.println(nc);
		}	
	}

}

class PersonS {

	private String name;
	private int age;
	private String city;

	public PersonS(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

}

	


