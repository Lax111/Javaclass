//LAXMI

package test2;

import java.util.ArrayList;

public class arraylisttest {

	public static void main(String[] args) {
		

		person16 gopu = new person16 ("Gopal", "sharma");
		person16  gopu2 = new person16 ("Gopal", "sharma");
		person16  gopu3 = new person16("Gopal", "sharma");
		
		
		
		ArrayList <person16 > studentA = new ArrayList <>();
		
		studentA.add(gopu3);
		studentA.add(gopu3);
		studentA.add(gopu3);
		
		
		studentA.get(0).displayname();
		
	
		for(person16  abc:studentA) {
			System.out.println(abc.firstName);
			System.out.println(abc.lastName);
			abc.displayname();
		}}
	}
		
	

class person16 {
	String firstName;
	String lastName;
	
	public person16(String fn,String ln){
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public void displayname() {
		System.out.println(this.firstName+this.lastName);
	}
	
}
	
	
