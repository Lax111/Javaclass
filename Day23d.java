package test2;

public class Day23d {

	public static void main(String[] args) {
		
		Professor P = new Professor("Computer");
		P.displaySubject();
		P.xyz();
}
}

class TeacherP {
	
	protected String subject;
	
	public TeacherP(String sub) {
		this.subject = sub;
	}
	
	public void xyz() {
		System.out.println("teacher xyz");
	}
}

class Professor extends TeacherP {

	String subject = "Science";
	public Professor(String sub) {
		super(sub);
		
	}
	public void displaySubject() {
	System.out.println(this.subject);
	System.out.println(super.subject);
		
	}	
		
	public void xyz() {
		System.out.println("Professor xyz");
		super.xyz();
	}
}	
		
		
		
	
	
	
	
