package test2;

import java.io.FileWriter;
import java.io.IOException;

public class Day39 {

	public static void main(String[] args) {

try {
	
	FileWriter writer = new FileWriter("MyFile.txt", true);
	System.out.println(10/0);
	writer.write("hello world");
	writer.write("\n");
	writer.write("hello kris");
	writer.close();
	
}catch (IOException e){
		
		e.printStackTrace();
		
	}
	catch(ArithmeticException e) {
	
	e.printStackTrace();
	System.out.println(e.getMessage());


	}
}
	

}