package test2;

import java.util.HashMap;
import java.util.Map;

public class DAY35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> course = new HashMap<String, String>();

		course.put("courseone", "Java");
		course.put("coursetwo", "Python");
		course.put("coursethree", "C++");
		course.put("coursefour", "C#");
		course.put("coursefive", "Selenium");

		System.out.println(course);
		
		for(Map.Entry<String, String>entry : course.entrySet()){
			System.out.println(entry.getKey()+ entry.getValue());
		}
		
		Map<String, String> students = new HashMap<String, String>();
		
		students.put("firstName", "Kris");
		students.put("lastName", "Sharma");
		students.put("rollNo", "108");
		students.put("age", "16");
		students.put("skills", "Giving");
		
		for(String aaaa: students.keySet()) {
			System.out.println(aaaa);
		}
		
		for(String bbbb: students.values()) {
			System.out.println(bbbb);
		}
		Map<String, String> vehicle = new HashMap<String, String>();
		vehicle.put("color", "black");
		vehicle.put("type", "suv");
		vehicle.put("company", "honda");
		System.out.println(vehicle);
		
		System.out.println(vehicle.get("color"));
		for(String key : vehicle.keySet()) {
			System.out.println(key);
			System.out.println(vehicle.get(key));
		}
		
		
	}

}
