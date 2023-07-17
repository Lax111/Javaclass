//Laxmi chapagain

package test2;

public class Day24a {

	public static void main(String[] args) {
		
		VehicleVV VV = new VehicleVV("Black","CRV", 200);
		System.out.println(VV.color);
		System.out.println(VV.model);
		
		
		
		//Calling out method
		
		VV.displaycolor();
		VV.displaychaseNoModel();
		
		//Creating a instance of child class
		
		CarZZ Honda = new CarZZ("Black", "touring", 200, "Honda");
		System.out.println(Honda.color);
		System.out.println(Honda.model);
		System.out.println(Honda.name);
		
		
		Honda.displaychaseNoModel();
		Honda.displaycolor();
		
		// overloading
		
		Honda.SubjZZ(10, 20);
		Honda.SubjZZ(5, 6, 9);
		Honda.SubjZZ(4, 2, 8, 5);
		
		//calling out parent method
		
		Honda.greetMsg();
		
		int Wheel = Honda.displayWheel();
		System.out.println(Wheel);
		
		
	}

}
class VehicleVV {
	String color;
	String model;
	private int chaseNo;
	
	public VehicleVV(String cl,String md,int chaseNo) {
		this.color = cl;
		this.model = md;
		this.chaseNo = chaseNo;
	}
	
	public void displaycolor() {
		System.out.println(this.color);
	}
	
	public void displaychaseNoModel() {
	System.out.println(this.chaseNo);
	this.displaychaseNoModel();
	}
	
	private void displayModelNo() {
		System.out.println(this.model);
	}
	
	public void greetMsg() {
		System.out.println("Welcome to our family");
	}
	
	protected void greetMsg3() {
	System.out.println("Welcome to our family3");
	
	}
}
class CarZZ extends VehicleVV {
String name;

private int wheel;

	public CarZZ(String cl, String md, int chaseNo, String nm) {
		super(cl, md, chaseNo);
		this.name = nm;
		
	}
	 //overloading
	public void SubjZZ(int s, int t) {
	System.out.println(s+t);
	}
	
	public void SubjZZ(int s, int t, int u) {
		System.out.println(s+t+u);
	}
	
		public void SubjZZ(int s, int t,int u, int v) {
			System.out.println(s+t+u+v);
		}	
	
	public int displayWheel() {
		return this.wheel;
	
	}
	//overriding
	public void greetMsg() {
		System.out.println("Welcome to new vehicle");
		super.greetMsg();
		this.greetMsg3();
	}
	
}
	
	
	
	

		
	
	
	
	
	
	
	
	
	
	
	
