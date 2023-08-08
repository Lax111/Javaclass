//Laxmi chapagain

package test2;

import java.util.HashMap;
import java.util.Map;

public class hashmaptest {

	public static void main(String[] args) {
		
		
		Map<String,String> employee = new HashMap<String, String>();
		
		employee.put("empFirstName","govinda");
		employee.put("empLastName","sharma");
		employee.put("empRollNo","108");
		employee.put("empage","16");

		for(String aaa: employee.keySet()) {
		System.out.println(aaa);
		}
		for(String bbb: employee.values()) {
			System.out.println(bbb);
		}
		
		
	}
	}


