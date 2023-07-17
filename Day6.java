package test2;

public class Day6 {

	public static void main(String[] args) {
		
		
		//Conditional statement
		//one input and multiple outcomes
		
		
		//numT > 0 && numT <= 5 --- 10% discount
		//numT > 5 && numT <= 10 --- 20% discount
		//numT > 10 --- 30% discount
		
		
	//	if(condition) {
		// statement will be executed
	
		//Program 1:
	
	int numT = 10;
	
	if(numT > 0 && numT <= 5) {
		System.out.println("10% discount");
	}
	if(numT > 5 && numT <= 10) {
	System.out.println("20% discount");
	}
	if(numT > 10) {
		System.out.println("30% discount");
	}
	
	//Program 2:
	
	int numTo = -25;
	
	if(numTo > 0 && numTo <= 10) {
		System.out.println("10% discount");
	}
	else if(numTo > 10 && numTo <= 20) {
	System.out.println("20% discount");
	}
	else if(numTo > 20) {
		System.out.println("30% discount");
	}
	else {
		System.out.println("Incorrect input");
	}
	
	//program3:
	
int marks = 10;
	
	if(marks > 0 && marks <= 15) {
		System.out.println("Grade A");
	}
	if(marks > 5 && marks <= 30) {
	System.out.println("Grade B");
	}
	if(marks> 30) {
		System.out.println("Grade C");
	}
	
	//program4
	
int mark = 30;
	
	if(mark > 0 && mark <= 25) {
		System.out.println("10% discount");
	}
	else if(mark > 25 && mark <= 40) {
	System.out.println("20% discount");
	}
	else if(mark> 40) {
		System.out.println("30% discount");
		
	}else {
		System.out.println("Fail try again");	
		}
		//program5:
	
	int u = 20;
	int v = 15;
	
	if(u > v) {
		System.out.println("u is greater");
	}else {
		System.out.println("v is greater");
	}
	
	
	//program 6:
	
	int a = 100;
	int b = 80;
	int c = 250;
	
	if(a > b && a > c) {
		System.out.println("A is greater");
	}else if (b > a && b >c) {
		System.out.println("B is greater");
	}else {
		System.out.println("C is greater");
	}
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		



