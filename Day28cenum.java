package test2;

enum SizeS{
	
	SMALL , MEDIUM, LARGE, EXTRALARGE;
	
	public int getSize()  {
		switch(this) {
		
		case SMALL:
			return 5;
		
		case MEDIUM:
			return 6;
			
		case LARGE:
			return 7;
		
		case EXTRALARGE:
			return 8;
		}
		return 0;
		}
	}	
	
public class Day28cenum {

	public static void main(String[] args) {
		int order = SizeS.LARGE.getSize();
		System.out.println(order);		
			
		}

	}


