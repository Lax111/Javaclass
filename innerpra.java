package test2;

public class innerpra 
{

	public static void main(String[] args) {
	
		Organic og = new Organic();
		og.OrganicTest();
		
		Organic.milkTea ml = og.new milkTea();
		ml.MelkTeaTest();

	}

}
class Organic {

	
	public void OrganicTest(){
	
		System.out.println("this is tea/ green tea");
	}
	
	// inner class
	class milkTea{
	
		public void MelkTeaTest(){
		
			System.out.println("Please add sugar too.");
		}
	}
}