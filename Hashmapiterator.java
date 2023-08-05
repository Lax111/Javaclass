package test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmapiterator {

	public static void main(String[] args) {
		
		
		//HashMap<String integer> = new HashMap<>();
		 HashMap<String, String> department= new HashMap<>();

	        // Add some key-value pairs
		 department.put("Soraj", "20");
		 department.put("Shyam", "24");
		 department.put("Adi", "23");
		 department.put("Abi", "22");

	        // Get the iterator for the HashMap
	        Iterator<Map.Entry<String, String>> iterator = department.entrySet().iterator();

	        // Iterate over the key-value pairs using the iterator
	        while (iterator.hasNext()) {
	            Map.Entry<String, String> entry = iterator.next();
	            String key = entry.getKey();
	            String value = entry.getValue();
	            System.out.println("Key: " + key + ", Value: " + value);
	        }
	    }
	



		
		
		
		
		
		
		
		
		
		
		
		

	}


