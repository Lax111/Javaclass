package test2;

import java.util.ArrayList;

public class Day31ArrayList {

	public static void main(String[] args) {
		
		Person15 Kris = new Person15("Krishna","Sharma");
		Person15 Kris11 = new Person15("Krishna","Sharma");
		Person15 Kris12 = new Person15("Krishna","Sharma");
		Person15 Kris13 = new Person15("Krishna","Sharma");
		Person15 Kris14 = new Person15("Krishna","Sharma");
		
		ArrayList<Person15> students = new ArrayList<>();
		
		students.add(Kris);
		students.add(Kris11);
		students.add(Kris12);
		students.add(Kris13);
		students.add(Kris14);
		
		students.get(0).displaypName();
		
		
		//for loop
		
		for(int a = 0; a < students.size();a++){
			System.out.println(students.get(a).firstName);
			System.out.println(students.get(a).lastName);
			students.get(a).displaypName();
		}
		
		//While loop
		
		int x = 0;
		while(x <students.size()) {
			System.out.println(students.get(x).firstName);
			System.out.println(students.get(x).lastName);
			students.get(x).displaypName();
			x++;
			
		}
		//for each loop
		
		for(Person15 z : students) {
			System.out.println(z.firstName);
			System.out.println(z.lastName);
			z.displaypName();
		}
		
		
		
		
		
	}

}


class Person15{
	String firstName;
	String lastName;
	
	
	public Person15(String fn,String ln) {
		this.firstName = fn;
		this.lastName = ln;
		
	}
	public void displaypName() {
	System.out.println(this.firstName+this.lastName);
	
}}