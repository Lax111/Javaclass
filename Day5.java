package test2;

public class Day5 {

	public static void main(String[] args) {
		
		
	//Comparison operator
		//< , > <= , >= ,!= ,==
		
		System.out.println(10 < 5);
		System.out.println(10 > 5);
		System.out.println(10 <= 5);
		System.out.println(10 >= 5);
		System.out.println(10!= 5);
		System.out.println(10 == 5);
		
		
		//logical operator
		
		//AND --- &&
		
		//true && true --- true
		//false && true --- false
		//true && false --- falsa
		//false && false --- false
		
		
		System.out.println(10==10 && 15==15);
		System.out.println(10!=10 && 15==15);
		System.out.println(10==10 && 15!=15);
		System.out.println(10!=10 && 15!=15);
		
		
		//OR --- ||
		
		//true || true -- true
		//false || true -- true
		//true || false -- true
		//false || false -- false
		
		System.out.println(15==10 || 15==10);
		System.out.println(15==15 || 15==10);
		System.out.println(15==5 || 15==15);
		System.out.println(15==15 || 15==15);
		
		
		//NOT --- !
		
		//true -- false
		//false -- true
		
		System.out.println(10==10);
		System.out.println(10==7);
		
		
		
	}

}
