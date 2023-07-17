package test2;

public class Day23c {

	public static void main(String[] args) {
		

		HumanZ Z = new HumanZ(567);
		System.out.println(Z.SSN);
		
		
		StudentM n = new StudentM(2468);
		n.displaySSN();
	
	}

}
//Protected

class HumanZ {
	
	protected int SSN;
	public HumanZ(int ssn) {
		this.SSN = ssn;
	}
}

class StudentM extends HumanZ {

	public StudentM(int ssn) {
		super(ssn);
		
	}
	
	public void displaySSN() {
		System.out.println(this.SSN);
	}
}