package test2;

public class days24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vehicleZZZ ZZ = new vehicleZZZ("Black", "crv", 345);
		//accessing properties
		
		System.out.println(ZZ.color);
		System.out.println(ZZ.model);
		//System.out.println(ZZ.chaseNo);private
		
		//calling out method
		
		ZZ.displaycolor();
		ZZ.displaychadeNoandModel();
		//ZZ.displayModelNo();
		
		//creating a instance of child class
		
		CarZZZ Honda1 = new CarZZZ("Black","crv" , 234, "Honda1");
		System.out.println(Honda1.color);
		System.out.println(Honda1.model);
		System.out.println(Honda1.name);
		
		
		Honda1.displaychadeNoandModel();
		Honda1.displaycolor();
		
		//overloading
		
		Honda1.lunchDate(2001);
		Honda1.lunchDate(2002, "jan");
		Honda1.lunchDate(2003,"feb", 25);
		
	//calling out parent method
		
		Honda1.greedMsg();
		
		
		
	}

}
class vehicleZZZ {
	String color;
	String model;
	private int chaseNo;
	
	public vehicleZZZ(String cl, String md, int chaseNo) {
		this.color = cl;
		this.model = md;
		this.chaseNo = chaseNo;
	}
	public void displaycolor() {
		System.out.println(this.color);
	}
	
	public void displaychadeNoandModel() {
		System.out.println(this.chaseNo);
		this.displayModelNo();
	}
	
	private void displayModelNo() {
	System.out.println(this.model);
	}
	
	public void greedMsg() {
	System.out.println("congration");
	
	
	
	
	
	
	}}
	
class CarZZZ extends vehicleZZZ{
String name;

	public CarZZZ(String cl, String md, int chaseNo,String nm) {
		super(cl, md, chaseNo);
		this.name = nm;
		
	}
	
	public void lunchDate(int year) {
		System.out.println(year);
	}
	public void lunchDate(int year, String month) {
	System.out.println(year);
	System.out.println(month);
	}
	
	public void lunchDate(int year,String month, int date) {
	System.out.println(year);
	System.out.println(month);
	System.out.println(date);
	
	}	
	
	//overriding
	
	
	public void greedMsg() {
		System.out.println("congration to you");
	
	
	
	
	}	
}