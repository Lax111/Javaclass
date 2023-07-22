package test2;

import java.util.Arrays;

public class Group1Laxmiprac2 {

	public static void main(String[] args) {
		

				//public class OverridingAndOverloading 
				//{

				
				 
				  int i = 8;
				  int j =9;
				  int[] ints = {5,6,8,9};
				  String [] objs= {"Rita", "Laxmi", "Pragati","Rabi"};
				  
				  Students9 ss= new Students9();
				  ss.subject(i);
				  ss.subject(i, j);
				  ss.subject(ints);
				  ss.subject(objs);
				  
				  Teachers9 ts= new Teachers9();
				  ts.subject(i);
				  ts.subject(i, j);
				  ts.subject(ints);
				  ts.subject(objs);
				 }

				}
				// overloading
				class Students9
				{
				 public void subject(int i) 
				 {
				  System.out.println(" your first integer"+ i);
				 }
				 public void subject(int i, int j) 
				 {
				  System.out.println("Your two integers"+ i +", "+ j);
				 }
				 public void subject(int [] ints) 
				 {
				  System.out.println("Array integer here:"+Arrays.toString(ints));
				 }
				 public void subject(String[] objs ) 
				 {
				  System.out.println("Array string here:"+Arrays.toString(objs));
				 }
				}

				class Teachers9 extends Students9
				{
				 public void subject(int i) 
				 {
				  System.out.println("your i power i is :"+ i*i);
				 }
				 public void subject(int i, int j) 
				 {
				  System.out.println("your send case" + i +j);
				 }
				 public void subject(int [] ints) 
				 {
				 System.out.println(ints[1]);
				 }
				 public void subject(String[] objs ) 
				 {
				  System.out.println(objs[1]);
				 }
				

				


	}


