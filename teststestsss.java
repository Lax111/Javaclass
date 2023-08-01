//innerclass

package test2;

public class teststestsss {

	public static void main(String[] args) {
	
		Organic5 org = new Organic5();
		org.OrgaincTest();
		
		Organic5.MilkTea mt = org.new MilkTea();
		mt.MilkTea();
			
	}}

class Organic5{
	
	public void OrgaincTest() {
		System.out.println("this is tea/green tea");
	}
	
	class MilkTea {
		
		public void MilkTea() {
			System.out.println("please add sugar this is milk tea");
		}
		
	}
	
}