package test2;

public class Day11 {

	public static void main(String[] args) {
		
		//string --- properties and method
		
		//how to define string?
		
		String name = "ISKCON";
		System.out.println(name);
		System.out.println(name.length());
		
		// 0 1 2 3 4 5
		// I S K C O N
		
		//string is collection on characters
		//string stores the value by index
		
		//chartAt();
		
		char thirdChar = name.charAt(3);
		System.out.println(thirdChar);
		
		//length()
		//action - count total number of char
		//return - int
		
		String cityName = "Baltimore";
		int totalChar = cityName.length();
		System.out.println(totalChar);
		
		//length - 1 is always the last index
		
		//program3:
		
		String countryName = "NEPAL";
		int totalChar1 = countryName.length();
		System.out.println(totalChar1);
		
		
		for(int a1 = 0; a1 < totalChar1; a1++) {
		System.out.println(a1);
		System.out.println(countryName.charAt(a1));
		
		
		//program 4:
		
		String city = "Columbia";
	
		for(int e = 0; e < city.length(); e++) {
			System.out.println(e);
			System.out.println(city.charAt(e));
		}
		
		
		
		//program5:
		//print every char in reverse order
		
		for(int x = city.length()-1; x >= 0; x--) {
		System.out.println(x);
		System.out.println(city.charAt(x));
		
		}	

		//program 6:
		
		String Country1 = "United States";
		String upperCaseString = Country1.toUpperCase();
		System.out.println(upperCaseString);
		}
		
		
		String Country1 = "INDIA";
		String lowerCaseString = Country1.toLowerCase();
		System.out.println(lowerCaseString);
		}
		
	
	}

