//Hashmap

package test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestTestt {
 
		 public static void main(String[] args) { 
		  HashMap<String ,Integer> People = new HashMap<>(); 
		   
		  //adding data 
		   
		  People.put("Ram", 25); 
		  People.put("Rammy", 65); 
		  People.put("Kiran", 39); 
		  People.put("Hari", 45); 
		  People.put("Prem", 29); 
		   
		  //print out 
		  System.out.println(People); 
		   
		  // looping through HashMap 
		   
		  System.out.println(People.values()); 
		  System.out.println(People.keySet()); 
		   
		  //  for looping over  
		   
		  for (Map.Entry<String, Integer> abc: People.entrySet()) 
		  { 
		   String k = abc.getKey(); 
		   Integer o = abc.getValue(); 
		   System.out.println(k); 
		   System.out.println(o); 
		     
		   
		  // using while loop 
		   
		  Iterator it = People.entrySet().iterator(); 
		  while(it.hasNext()) 
		  { 
		   Map.Entry me= (Map.Entry) it.next(); 
		   System.out.println("Name :"+me.getKey()+" Age:"+me.getValue()); 
		  } 
		   
		 } 
		 
		}

	}


