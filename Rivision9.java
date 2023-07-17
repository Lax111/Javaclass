//Laxmi chapagain

package test2;

public class Rivision9 {

	public static void main(String[] args) {
		
	PersonC Govinda = new PersonC();
		
		System.out.println(Govinda.age);
		System.out.println(Govinda.fullName);
		
		
		Govinda.age = 15;
		Govinda.fullName = "Govinda Sharma";
		
		System.out.println(Govinda.age);
		System.out.println(Govinda.fullName);
		
		PersonC Kris = new PersonC();
		Kris.fullName = "Kris sharma";
		Kris.displayName();
		
		
		PersonD Govinda2 = new PersonD("Govinda2 Sharma2" , 20);
		Govinda2.displayName();
		
		PersonD Govinda3 = new PersonD("Govinda3 Sharma3", 30);
		Govinda3.displayName();
		
	}}
		
		class PersonC{
			
		
		String fullName;
		int age;
		
		public void displayName() {
			System.out.println(this.fullName);

	}

}
class PersonD{
	
	String fullName;
	int age;
	
	public PersonD(String fn, int ag) {
		this.fullName = fn;
				this.age = ag;
		
	}
	
	public void displayName() {
		System.out.println(this.fullName);
	}

		
}	
		
		
		