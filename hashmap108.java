package test2;

import java.util.HashMap;
import java.util.Map;

public class hashmap108 {

	public static void main(String[] args) {
		
		//program 1
		Map<String, String> fruits = new HashMap<String, String>();
		
		fruits.put("fruitsOne", "mango");
		fruits.put("fruitsTwo", "papaya");
		fruits.put("fruitsThree", "orange");
		
for(Map.Entry<String, String> abc:fruits.entrySet()) {
	System.out.println(abc.getKey()+abc.getValue());
}

//program 2
	
Map<String,String> employee = new HashMap<String,String>();

employee.put("empFirstName", "Gopal");
employee.put("empLastName", "sharma");
employee.put("empssn", "123456789");

for(String aaa:employee.keySet()){
	System.out.println(aaa);
}

for(String aaa:employee.values()) {
	System.out.println(aaa);
}

	}

}
