package test2;

import java.util.ArrayList;

public class arraylistwithloops {

	public static void main(String[] args) {
		
		people ram = new people("ram","rai");
		people ram2 = new people("ram","rai");
		people ram3 = new people("ram","rai");
		people ram4 = new people("ram","rai");
		people ram5 = new people("ram","rai");
		
		ArrayList<people> government = new ArrayList<>();
		government.add(ram);
		government.add(ram2);
		government.add(ram3);
		government.add(ram4);
		government.add(ram5);
		
		
		government.get(0).display();
		
		//for loop
		
		for(int x = 0; x < government.size();x++) {
		//System.out.println(x);
		System.out.println(government.get(x).firstName);
		System.out.println(government.get(x).lastName);
		government.get(x).display();
		
		
		int a = 0;
		while (a< government.size()) {
			System.out.println(government.get(a).firstName);
			System.out.println(government.get(a).lastName);
			government.get(a).display();
			a++;
		}
		
		for(people )
		
		
		
		
	}

}


class people{
	String firstName;
	String lastName;
	
	
	public people(String fn,String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public void display() {
		System.out.println("this.firstName+ this.lastName");
	}
	
}