package test2;

public class Day7 {

	public static void main(String[] args) {
		
	//Switch case without break statement
		
		//program 1:
		
		String city = "Baltimore";
		switch(city) {
		case "Catonsville":
			System.out.println("MD");
		case "Towson":
			System.out.println("MD");
		case "Centreville":
			System.out.println("va");
		case "Herndon":
			System.out.println("VA");
			default:
				System.out.println("Incorrect city name");
			
			
		}
		
		//program 2:
		
		String city1 = "Columbia";
		switch(city) {
		case "Potomac":
			System.out.println("MD");
			break;
		case "Towson":
			System.out.println("MD");
			break;
		case "Centreville":
			System.out.println("va");
			break;
		case "Herndon":
			System.out.println("VA");
			break;
			
			default:
				System.out.println("Incorrect city name");
			
		}
		
		//program 3:
		
		
		String city2 = "Columbia";
		switch(city) {
		case "Potomac1":
		case "Columbia":
			System.out.println("MD");
			break;
		case "Towson":
		case "Ridge rd":
			System.out.println("MD");
			break;
		case "Centreville":
		case "Herndon1":
			System.out.println("va");
			break;
		case "Herndon":
		case "Richmond":
			System.out.println("VA");
			break;
			
			default:
				System.out.println("Incorrect city name");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	

	}


