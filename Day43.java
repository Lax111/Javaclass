package test2;

import java.io.FileWriter;
import java.io.IOException;

public class Day43 {

	public static void main(String[] args) {
		
		
	String fileName = "example.txt";	
		
		try {
			
			FileWriter writer = new FileWriter(fileName);
			
			writer.write("Hello world");
			writer.write("I am learning java");
			writer.write("I am learning sql");
			writer.write("\n");
			writer.write("I am learning git");
			writer.write("I am learnin rubi");
			writer.write("I am learning python");
			writer.close();
			System.out.println("Data successfully written and file is closed");
		}
		catch(IOException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
		

	}
}
