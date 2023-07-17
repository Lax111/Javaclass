package test2;

public class Day22c {

	public static void main(String[] args) {
		

	Computer AA = new Computer();	
		AA.subs(20,10);
		AA.subs(30,10,5);
		AA.subs(40,30,10,5);
		
	}
}
//overloading

class Computer {
	
	public void subs(int s, int t) {
		System.out.println(s-t);
	}
	
	public void subs(int s, int t, int u) {
		System.out.println(s-t-u);
	
	}
	
	public void subs(int s, int t, int u, int v) {
		System.out.println(s-t-u-v);
	
	}
	
	}