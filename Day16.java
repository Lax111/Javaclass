package test2;

public class Day16 {

	public static void main(String[] args) {
		
		
		
		
		
		Human2 chinmay = new Human2("chinmay deshpande",33);
		Human2 ram = new Human2("ram dani",32);
		
		System.out.println(ram.age);
		System.out.println(ram.name);
		
		System.out.println(chinmay.age);
		System.out.println(chinmay.name);
		
		String a = chinmay.talk();
		System.out.println(a);
	}

}

class Human2 {
	
	int age;
	String name;
	
	public Human2(String nm , int ag) {
		this.name = nm;	
		this.age = ag;
	}
	
	public String talk() {
		return "Hello";
	}
	
	public void walk() {
		System.out.println("I am walking");
	}
}
	
	

		
		

	


