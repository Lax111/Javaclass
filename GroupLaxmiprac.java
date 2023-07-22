package test2;

public class GroupLaxmiprac {


		//public class InheritanceRaj 
		//{// overriding, inheratince, construction

		 public static void main(String[] args) 
		 {
		  employee ep= new employee("Rita Katiwada", 43);
		  ep.work();
		  
		  HR rr= new HR("Laxmi jee", 37, "IT");
		  rr.work();

		 }

		}
		class employee
		{ 
		 String Name;
		 int Salary;

		 public employee(String nm,  int sal)
		 {
		  this.Name = nm;
		  this .Salary = sal;
		 }
		 
		 public void work()
		 {
		  System.out.println("Active  employee \t"+ this.Name);
		 }
		 
		}
		class HR extends employee
		{
		 String position;
		 public HR(String nm, int sal, String pt) 
		 {
		  super(nm, sal);
		  this.position= pt;
		  
		 }
		 public void work() {
		  System.out.println("New Active employee "+ this.Name +","+this.Salary +","+this.position);
		 }
		 
		 
		 
		

	}


