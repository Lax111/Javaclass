package test2;

public class Constructor {

	public static void main(String[] args) {
		
		StudentAAA1 aaa = new StudentAAA1(20, 3000);
		System.out.println(aaa.Age);
		System.out.println(aaa.Salary);

		StudentAAA1 bbb = new StudentAAA1("lax", "cha");
		System.out.println(bbb.fName);
		System.out.println(bbb.lName);
	}

}
class StudentAAA1 {
	String fName;
	String lName;
	int Age;
	double Salary;
	
	public StudentAAA1(String fn, String ln) {
	this.fName = fn;
	this.lName = ln;
	}
	public StudentAAA1(int ag,double sal) {
		this.Age = ag;
		this.Salary = sal;
	}
}
