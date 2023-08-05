package test2;

import java.util.HashMap;
import java.util.Map;

public class HashMap123 {

	public static void main(String[] args) {
		
		Map<String,String> fruits = new HashMap<String,String>();
		
		fruits.put("fruitsOne", "mango");
		fruits.put("fruitsTwo", "orange");
		fruits.put("fruitsThree", "papaya");
		fruits.put("fruitsFour", "banana");
		fruits.put("fruitsFive", "apple");
		System.out.println(fruits);
		
		for(Map.Entry<String, String>entry : fruits.entrySet()) {
			System.out.println(entry.getKey()+ entry.getValue());
			
			//program 2
		}

		Map<String,String> employees = new HashMap<String, String>();
		
		employees.put("empFirstName","govinda");
		employees.put("emplastName","sharma");
		employees.put("emprollNo","108");
		employees.put("empage","16");
		employees.put("empskills","working");
		
		for(String prop:employees.keySet()) {
			System.out.println(prop);
		}
		
		for(String prop:employees.values()) {
			System.out.println(prop);
		}
		
		Map<String,String> computer = new HashMap<String,String>();
		
		computer.put("color", "black");
		computer.put("type", "macbookpro");
		computer.put("company", "apple");
		System.out.println("computer");
		
		System.out.println(computer.get("type"));
		for(String prop:computer.keySet()) {
			
			System.out.println(prop);
			System.out.println(computer.get(prop));
		}
		
		
		
	
}}

