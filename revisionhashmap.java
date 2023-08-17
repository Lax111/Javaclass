//Laxmi

package test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class revisionhashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> hasMaps = new HashMap<>();
		System.out.println(hasMaps);

		
		//add
		
		hasMaps.put("one", 1);
		hasMaps.put("two", 2);
		hasMaps.put("three",3);
		hasMaps.put("four", 4);
		System.out.println(hasMaps);
		
		//update
		
		hasMaps.put("two", 55);
		System.out.println(hasMaps);
		
		//getting the value(retrive)
		int xyz = hasMaps.get("three");
		System.out.println(xyz);
		
		
		hasMaps.remove("four");
		System.out.println(hasMaps);
		
		//allow duplicate keys?
		
		hasMaps.put("one", 2);
		System.out.println();
		
		System.out.println(hasMaps.size());
		
		HashMap<String, String> hasMapss = new HashMap<>();
		hasMapss.put("MD1", "baltimore");
		hasMapss.put("VA", "herndon");
		hasMapss.put("MD2", "catonsville");
		hasMapss.put("MD3", "towson");
		
	
		
		if(hasMapss.containsKey("MD1")) {
		System.out.println(hasMapss.get("MD1"));
		
	}
		
		if(hasMapss.containsValue("MD1")) {
			System.out.println(hasMapss.get("MD1"));
			System.out.println("******Next case*******");
			//System.out.println("value available ..."); 
			
		}
			for(String key:hasMapss.keySet()) {
				System.out.println(key);
				System.out.println(hasMapss.values());
				
				
				System.out.println(hasMapss.keySet());
				System.out.println(hasMapss.values());
				
				
				
				for(Map.Entry<String, String> entry : hasMapss.entrySet()) {
				System.out.println(entry.getKey()+ entry.getValue());
				
				}
				
				HashMap<String, String> hasMapsss = new HashMap<>();
				hasMapsss.put("Kris", "sharma");
				hasMapsss.put("saroj", "sharma");
				hasMapsss.put("shashi", "sharma");
				hasMapsss.put("shanvi", "sharma");
				System.out.println(hasMapsss);
				
			
				Iterator<Map.Entry<String,String>>abc = hasMapsss.entrySet().iterator();
				
				while(abc.hasNext()) {
					Map.Entry<String, String>entry = abc.next();
					System.out.println(entry.getKey());
					System.out.println(entry.getValue());
					
				}
	
	
	
	}}}


