
//Laxmi chapagain
package test2;

public class Revision7 {

	public static void main(String[] args) {
		
		int [] numbers = new int [3];
		
       numbers[0]= 100;
       numbers[1]= 200;
       numbers[2]= 300;
		
		
       //for loop
       
       
		for(int s = 0; s < numbers.length; s++) {
			System.out.println(s);
			System.out.println(numbers[s]);
		}
       
		
		//for loop
		
       int[] numbers1 = {100,200,300};
       
       for(int t = 0; t < numbers1.length; t++) {
		System.out.println(t);	
       
	}

     //for while loop  
       
       int[] numbers2 = {100,200,300};
       
       int u = 0;
       while(u < 3) {
    	   System.out.println(u);
    	   u++;
       }
       
       //for each loop
       
       for(int v : numbers2) {
    	   System.out.println(v);
       }
       
       
       String[] firstNames = new String[3];
       firstNames[0] = "Ram";
       firstNames[1] = "Shyam";
       firstNames[2] = "Krishna";
       String[]firstNames1 = {"Ram","Shyam", "Krishna"};
       
       
       //for loop
       
       for(int w = 0; w <firstNames.length; w++) {
       System.out.println(w);
       System.out.println(firstNames[w]);
       
       } //while loop
       
       int a = 0;
       while(a <firstNames.length) {
    	   System.out.println(a);
    	   a++;
       }
        
       
       //for each loop
       
       for(String x : firstNames) {
    	   System.out.println(x);
       }
       
       
       
       
       
       }    
       
       
}
