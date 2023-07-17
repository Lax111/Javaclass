package test2;

public class prac1 {

	public static void main(String[] args) {
		
		StudentTTT Nara = new StudentTTT();
			
		System.out.println(Nara.firstName);
		System.out.println(Nara.lastName);
			
		Nara.firstName = "Nara";
		Nara.lastName = "Rai";
		
		System.out.println(Nara.firstName);
		System.out.println(Nara.lastName);
		Nara.displaName();
		
		
		Professor1 Romi = new Professor1();
		System.out.println(Romi.firstName);
		System.out.println(Romi.lastName);
		System.out.println(Romi.Salary);
		
		
		Romi.firstName = "Romi";
		Romi.lastName = "Lama";
		Romi.Salary = 2000;
		
		Romi.displaName();
		Romi.displaySalary();
		
		
		
		
		
		}
	}



class StudentTTT {
	String firstName;
	String lastName;
	
	public void displaName() {
		System.out.println(this.firstName+ this.lastName);
	}
}

class Professor1 extends StudentTTT {
	int Salary;
	
	public void displaySalary() {
		System.out.println(this.Salary);
	}
}