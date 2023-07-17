package test2;

public class prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computerqwe cc = new Computerqwe();
		cc.subj(12, 8);
		cc.subj(16, 10, 6);
		cc.subj(20, 12, 10, 7);
		
	}

}

class Computerqwe {
	
	public void subj(int a, int b) {
		System.out.println(a+b);
	}
	
	public void subj(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void subj(int a, int b, int c, int d) {
	System.out.println(a+b+c+d);
	
	
}}