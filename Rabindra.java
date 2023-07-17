/**
 * 
 */
package test2;

/**Developed by Laxmi C.
 * Date : July 10, 2023
 */
public class Rabindra 
{
	/**
	 * constructor ,with private  and protected
	 */
	public static void main(String[] args) 
	{
		computerA aaa= new computerA(42,"Rita");
		aaa.displayComputer();
		System.out.println("-----Next case----");
		computerB bbb = new computerB(38,"Laxmi", "Chapagai"); // single inheritance
		bbb.displayComputer1();
		System.out.println("-----Next case----");
		computerC cc= new computerC(39, "Naba Raj", "Khatiwada", 54000.25);// multi inheritance
		cc.displayNamePrice();
	}

}
class computerA
{
	private int age ;// can not access to other class
	protected String name;// can access to other class
	public computerA(int ag, String nm) 
	{
		this.age = ag;
		this.name = nm;
	}
	// method
	public void displayComputer()
	{
		System.out.println("Name :\t"+this.name +"\tAge:\t" +this.age);
	}
	public void displayAge()
	{
		System.out.println("Age:\t" +this.age);
	}

}
//from A  --- single  inheritance
class computerB extends computerA	
{
	protected String lastname;

	public computerB(int ag, String nm, String ln) {
		super(ag, nm);
		this.lastname=ln;
		
	}
	//method
	public void displayComputer1()
	{
		System.out.println("Last Name \t:"+this.lastname);
		super.displayComputer();// call private
		
	}	
}
class computerAA extends computerA //from A  -- hybrid
{

	public computerAA(int ag, String nm) {
		super(ag, nm);
		// TODO Auto-generated constructor stub
	}
	
}
class computerC extends computerB // from B -- multiple inheritance
{ 
	protected double price;
	public computerC(int ag, String nm, String ln, double pr) 
	{
		super(ag, nm, ln);
		this.price = pr;
	}
	public void displayNamePrice()
	{
	System.out.println("First Name:\t"+this.name+"\tLast Name:\t"+this.lastname + "\tIncome:\t"+this.price);
	super.displayAge();
	}

}