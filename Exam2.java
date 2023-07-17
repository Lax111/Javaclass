//Laxmi chapagain

package test2;

public class Exam2 {

	public static void main(String[] args) {
		
		//Write a example for Multiple level inheritance(a->b-c)
//   write a example of method overriding
		//write a example of method overloading
	

//No 5: write a example of method overloading
		
		
Computer6 AA = new Computer6();	
AA.subs(10,5);
AA.subs(20,10,3);
AA.subs(50,20,10,2);

}
}
//overloading

class Computer6{

public void subs(int a, int b) {
System.out.println(a+b);
}

public void subs(int a, int b, int c) {
System.out.println(a+b+c);

}

public void subs(int a, int b, int c, int d) {
System.out.println(a+b+c+d);

}

}