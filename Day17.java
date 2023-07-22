package test2;

public class Day17 {

	public static void main(String[] args) {
		// program 1

//		
		Person[] students = { new Person("ranbir", "amatya",42),
				new Person("ram", "lama", 33),
				new Person("ravi", "sharma", 29),
				new Person("pooja", "dhakal", 28),
				new Person("ashwini", "dani", 56)

		};

		// for loop
		for (int i = 0; i < students.length; i++) {
			students[i].displayName();
		}

		// while
		int t1 = 0;
		while (t1 < students.length) {
			students[t1].displayName();
			t1++;
		}

		// forEach

		for (Person student : students) {
			student.displayName();
		}

// program 2

		Calculator june = new Calculator();
		june.addition(2, 3); // 5
		june.addition(2, 3, 4); // 9
		june.addition(2, 3, 4, 5); //14

	}

}

class Person {
	String firstName;
	String lastName;
	int age;

	public Person(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

class Calculator {

	public void addition(int x, int y) {
		System.out.println(x + y);
	}

	public void addition(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	public void addition(int x, int y, int z, int a) {
		System.out.println(x + y + z + a);
	}

	public void subs(int i, int j) {
		// TODO Auto-generated method stub
		
	}
}









		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


