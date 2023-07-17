package test2;

public class Day15 {

	public static void main(String[] args) {
		
		
		
		
		// int 
				// boolean 
				// String 
				// Array 
				// char
				// user defined data type
				
				
				// creating a instance or object
				
				
				Human chinmay = new Human();
				System.out.println(chinmay.age);
				System.out.println(chinmay.name);
				chinmay.walk();
				chinmay.talk();
				
				chinmay.age = 33;
				chinmay.name = "Chinmay Deshpande";
				System.out.println(chinmay.age);
				System.out.println(chinmay.name);
				
				
				// creating another object 
				
				Human ganesh = new Human();
				System.out.println(ganesh.age);
				System.out.println(ganesh.name);
				ganesh.talk();
				ganesh.walk();
				
				ganesh.age = 40;
				ganesh.name = "ganesh sharma";
				System.out.println(ganesh.age);
				System.out.println(ganesh.name);
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			}

		}


		class Human {
			// properties and methods
			int age;
			String name;
			
			// Methods
			
			public void talk() {
				System.out.println("I am talking ");
			}
			
			public void walk() {
				System.out.println("I am walking");
			}
				
		










		


	}


