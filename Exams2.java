package test2;

public class Exams2 {

	
	//No4:
	public static void main(String[] args) {

		int a = 10;
		int b = 30;
		int c = 40;
		int G = 50;
		
		Computer5 AA = new Computer5();
		AA.subs(a,b);
		AA.subs(a,b,c);
		AA.subs(a,b,c,G);

		Calculator5 CC = new Calculator5();
		AA.subs(a,b);
		AA.subs(a,b,c);
		AA.subs(a,b,c,G);

	}
}


class Computer5 {

	public void subs(int a, int b) {
		System.out.println(a + b);
	}

	public void subs(int a, int b, int c) {
		System.out.println(a + b + c);

	}

	public void subs(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);

	}
}

class Calculator5 extends Computer {

	public void subs(int a, int b) {
		System.out.println(a - b);
	}

	public void subs(int a, int b, int c) {
		System.out.println(a - b - c);

	}

	public void subs(int a, int b, int c, int G) {
		System.out.println(a - b - c - G);

	}

}
