package test2;

public class abstrac 
{
	public static void main(String[] args) 
	{
			rai r = new rai("Rita je", "Khatiwada", 43);
			r.calculation();
			r.displayfullname();
			System.out.println("area is :"+r.calculation());
			System.out.println(r.displayfullname());
	}
}

abstract class rita { // properties
	String firstName;
	String lastName;

	// constructor
	public rita(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
		System.out.println("hello from construction");
	}
	// method

	public abstract String displayfullname();

	abstract int calculation();
	
		
	}
	


class rai extends rita {
	int length;
	

	public rai(String fn, String ln, int lt) {
		super(fn, ln);
       this.length = lt;
	}

	@Override
	public String displayfullname() 
	{

		return "your fullname: "+ this.firstName+" " +this.lastName;
	}

	@Override
	int calculation() 
	{

		return length*length;
	}
	
}


