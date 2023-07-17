package test2;

public class Day23b {

	public static void main(String[] args) {

		AnimalZ cat = new AnimalZ(10);
		//System.out.println(cat.age);
		cat.displayAge();
		
		int q1 = cat.updateAge(8);
		System.out.println(q1);
		
		cat.displayMessage();
		
}
}
class AnimalZ {

	private int age;
	public AnimalZ(int ag) {
		this.age = ag;
	}
	
	
	//method returning string
	
	private String displayName() {
		return "I have a dog";
		
	}
	
	
	public void displayAge() {
	System.out.println(this.age);

	}	
		
	//method returning int
	
	public int updateAge(int updateAge) {
		this.age = updateAge;
	
		return this.age;
	}
	
	
	public void displayMessage() {
		String msg = displayName();
		System.out.println(msg);
	}
		
		
		
		
	
}