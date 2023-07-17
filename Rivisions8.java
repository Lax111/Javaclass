package test2;

public class Rivisions8 {

	public static void main(String[] args) {
		
	//Program1:
		
		String Cities [][]= {
		
				{"Baltimore","Catonsville"},
				{"Towson","Columbia"},
				{"Ridge rd","Silver spring"}
				
		};
		
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);

		//For loop:
		
		for(int g = 0; g < Cities.length; g++ ) {
		String State [] = Cities[g];
		
		for(int h = 0; h < State.length; h++) {
           System.out.println(h);

		}
		
		}
		//Program2:
		
		//While loop:
		int k = 0;
		while(k < Cities.length) {
			String a1[] = Cities[k];
			
			int k1 = 0;
			while(k1 < a1.length) {
				System.out.println(k1);
				k1++;
			}
			
		k++;
		}
		//program3:
		
		String city[][] = {
				
				{"Baltimore1","Catonsville1"},
				{"Towson1","Columbia1"},
				{"Ridge rd1","Silver spring1"}
				
		};
		
		int marks [] = {10,20,30};
		
		for(String[]x : city) {
			for(String y:x) {
				System.out.println(y);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
		
	}

