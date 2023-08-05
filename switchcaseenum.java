package test2;

enum veg {

	TOMATO, POTATO, BEANS, PANEER;

public String getVeg() {

switch (this) {

case TOMATO:
	return "tomato";
	
	
case POTATO:
	return "potato";
	

case BEANS:
	return "beans";
	
case PANEER:
	return "paneer";
}
	return "please check & conform";

}
}

public class switchcaseenum {

	public static void main(String[] args) {

	String type = veg.PANEER.getVeg();
		System.out.println(type);
	}

}
