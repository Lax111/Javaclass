

package test2;

interface CourseAB{
	
	
	public void CourseOne();
	
	public void CourseTwo();
	
	public void CourseThree();
	
	public void CourseFour();
	
	public void CourseFive();	
}

class ZorbaS implements CourseAB{

	
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
class RamS implements CourseAB{

	
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
	public class Day34hashmap {

			public static void main(String[] args) {
				
	

		CourseAB firm;
		
		firm = new ZorbaS();
		firm.CourseTwo();
		
		
		firm = new RamS();
		firm.CourseFour();
	}

}





















