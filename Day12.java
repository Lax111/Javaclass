package test2;

public class Day12 {

	public static void main(String[] args) {
		
		String  Name = "Krishna";
		String rev = "";
		
		for(int j = 0; j < Name.length(); j++) {
			//System.out.println(j);
			//System.out.println(Name.charAt(j));
			rev = Name.charAt(j)+ rev;
			
			
			//System.out.println(rev);
			
		}
		System.out.println(rev);
		
	
		
		//Program2:
	
	String country = "Baltimore";
	String rev2 = "";
		
	
	for(int p = country.length()-1; p >= 0; p--) {
	//System.out.println(p);
	//System.out.println(country.charAt(p));
		
		
	rev2 = rev2 + country.charAt(p);	
		
	}
	System.out.println(rev2);	

	//Method -----
	
	//program1
	
	String country1 = "usa";
	String uc = country1.toUpperCase();
	System.out.println(uc);
	System.out.println(country1.toUpperCase());
	System.out.println("Welcome ".toUpperCase()+ uc);
	
	
	//program2:
	
	String country2 = "INDIA";
	String lc = country2.toLowerCase();
	System.out.println(lc);
	
	//Program3:
	
	String country3 = "Nepal";
	int toc = country3.length();
	System.out.println(toc);
	
	//Program4:
	
	String country4 = "United States";
	int toc1 = country4.toUpperCase().toUpperCase().length();
	System.out.println(toc1);
	
	
	//program5:                                //0 1 2 3 4 5
	                                           //L o n d o n
	String country5 = "London";
	char c = country5.charAt(country5.length()-1);
	System.out.println(c);
	
	
	//program6:                               // 0 1 2 3 4 
                                              //C h i n a
	String country6= "China";
	
	String a1 = country6.substring(3);
	System.out.println(a1);
	
	String a2 = country6.substring(1,3);
	System.out.println(a2);
	
	
	//program7:
	
	//StartsWith()
	
	String city3 = "Baltimore";
	boolean a4 = city3.startsWith("B");
	System.out.println(a4);
	
	
	//EndsWith()
	
	String city4 = "Catonsville";
	boolean a5 = city4.endsWith("ville");
	System.out.println(a5);
	
	
	//Split();
	
	//come back to this after array
	
	String city5 = "I am learning python";
	String [] a6 = city5.split(" ");
	String [] a7 = city5.split("a");
	
	
	//replaceFirst()
	
	String city6 = "I am learning java and python";
	String a8 = city6.replaceFirst("python", "java");
	System.out.println(a8);
	
	
	//replaceAll()
	
	String a9 = city6.replaceAll("python", "java");
	System.out.println(a9);
	
	
	//replace
	
	String b1 = city6.replace("I","W");
	System.out.println(a9);
	
	
	//concat()
	
	String city11 = "towson";
	String city12 = "Welcome to";
	String a11 = city11.concat(city11);
	System.out.println(a11);
	
	
	//Contains()
	
	String city13 = "I am learning js in usa";
	boolean a12 = city13.contains("learning");
	System.out.println(a12);
	
	//equal()
	
	String city14 = "columbia";
	String city15 = "COLUMBIA";
	
	boolean a13 = city14.equals(city15);
	System.out.println(a13);
	
	
	
	//equalIgnoreCase()
	
	boolean a14 = city14.equalsIgnoreCase(city15);
	System.out.println(a14);
	
	
	//trim()
	
	String city16 = "I am learning Selenium";
	System.out.println(city16.length());
	String a15 = city16.trim();
	System.out.println(a15.length());
	
	
	//Contains
	
	String city17 = "i am learning  spanish";
	String city18 = "Spanish";
	boolean a16 = city17.toUpperCase().contains(city18);
	System.out.println();
	
	
	
	
	
	}}

