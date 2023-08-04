package test2;

interface Course{
	
	
	public void CourseOne();
	
	public void CourseTwo();
	
	public void CourseThree();
	
	public void CourseFour();
	
	public void CourseFive();	
	
}

class Zorba implements Course{

	
	public void CourseOne() {
		System.out.println("Zorba one");
		
	}

	
	public void CourseTwo() {
		System.out.println("Zorba two");
		
	}

	
	public void CourseThree() {
		System.out.println("Zorba three");
		
	}

	
	public void CourseFour() {
		System.out.println("Zorba four");
		
	}

	
	public void CourseFive() {
		System.out.println("Zorba five");
		
	}
	
}
class Ram implements Course{

	
	public void CourseOne() {
		System.out.println("one");
		
	}

	
	public void CourseTwo() {
		System.out.println("two");
	}

	
	public void CourseThree() {
		System.out.println("three");
		
	}

	
	public void CourseFour() {
		System.out.println("four");
		
	}

	
	public void CourseFive() {
		System.out.println("five");
		
	}
	
}















public class Days35 {

	public static void main(String[] args) {
		

		Course firm;
		
		firm = new Zorba();
		firm.CourseTwo();
		
		
		firm = new Ram();
		firm.CourseFour();
	}

}

