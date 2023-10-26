package test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Collection_Demo {

	public static void main(String[] args) {
		
		
		
		List<Integer> list = new ArrayList();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		for(int i = 0; i < list.size();i++) {
	System.out.println("printing through for loop "+list.get(i));
					
	}

		for(int i: list) {
			System.out.println("printing through for each "+i);
		}
	 Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+ " ");
			
		}
		ListIterator  li = list.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+ " ");
			
		}
		list.set(0, 25);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		List<Integer> list2 = new LinkedList();
		list2.add(11);
		list2.add(12);
		list2.add(13);
		list2.add(14);
		System.out.println(list2);
		
		
		
		
		
		
}
}