package test2;

enum SizeWW {

	SMALL, MEDIUM , LARGE,EXTRALARGE;

	public int getsize() {
	   switch(this){
		   
		   case SMALL: 
			   return 3;
			   
		   case MEDIUM:
			     return 4;
			     
		   case LARGE:
			   return 5;
			   
		   case EXTRALARGE:
			   return 6;
			   
		   default:
	           return 0;
	           
	}
	}
}

public class enumpracss {

	public static void main(String[] args) {
		int Order = SizeWW.LARGE.getsize();
	System.out.println(Order);	

	}

}
