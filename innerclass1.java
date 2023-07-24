package test2;

public class innerclass1 
{
	public static void main(String[] args) 
	{
		Department dp = new Department("Bakery","Boston");
		Department dp1 = new Department("Veg","Boston");
		Department.Employee ep= dp.new Employee();
		Department.Employee ep1= dp1.new Employee();
		
	ep.Employee();
	
	eEmployee();
		
		
	}

}
class Department
{ 
	//Properties
	String DeptName;
	String DeptLocation;
	
	//constructor
	public Department(String DN, String DL) 
	{
		this.DeptName = DN;
		this.DeptLocation= DL;
	}
	
	public void ABC() {
		System.out.println("cong");
	}
	// inner class
	class Employee 
	{
		//Properties
		String EmployeeName;
		
		//  method 
		 public void Employee(String en)
		{
			 this.EmployeeName = en;
			//accesing DeprLocation
		 if(Department.this.DeptName.equals("veg"))
		 { 
			
			System.out.println("this.EmployeeName");
			  			
			}
		else if(Department.this.equals("Bakery"))
				
			{
			
			System.out.println("this.EmployeeName");
				
			}
		}
	}
		
	
}
