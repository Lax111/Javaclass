package test2;

public class Day14 {

	public static void main(String[] args) {
		
		int marks[] = new int[5];
		marks[0] = 1;
		marks[1] = 2;
		marks[2] = 3;
		marks[3] = 4;
		marks[4] = 5;

		// 0 1 2 3 4
		int marks2[] = { 1, 2, 3, 4, 5 };
		String cities[] = { "mumbai", "pune", "banglore", "kolkalta" };

		// Array stores the value by index

		// for loop

		for (int i = 0; i < marks2.length; i++) {
			System.out.println();
			System.out.println(marks2[i]);
		}

		// while loop

		int t1 = 0;

		while (t1 < marks.length) {
			// System.out.println(t1);
			System.out.println(marks2[t1]);
			t1 = t1 + 1;
		}

		// forEach
		for (int a : marks2) {
			System.out.println(a);
		}

		// Multi- dimensional array

		int[][] marks3 = new int[3][4];

		marks3[0][0] = 1;
		marks3[0][1] = 2;
		marks3[0][2] = 3;
		marks3[0][3] = 4;

		marks3[1][0] = 11;
		marks3[1][1] = 22;
		marks3[1][2] = 33;
		marks3[1][3] = 44;

		marks3[2][0] = 555;
		marks3[2][1] = 666;
		marks3[2][2] = 777;
		marks3[2][3] = 888;

		System.out.println(marks3[1][2]);

//		{
//			{1,2,3,4},
//			{11,22,33,44},
//			{555,666,777,888}
//		}

		// program 1
		// for loop

		for (int i = 0; i < marks3.length; i++) {
			// System.out.println(i);
			int[] arr = marks3[i]; // {1,2,3,4}, //{11,22,33,44} , {555,666,777,888}
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}

		}

		// program 2

		int[][] numbers2 = {

				{ 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };

		for (int i = 0; i < numbers2.length; i++) {
			int[] arr = numbers2[i];
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}
		}

		// while loop
		// program 3

		int r1 = 0;

		while (r1 < numbers2.length) {
			int arr[] = numbers2[r1];
			int c1 = 0;
			while (c1 < arr.length) {
				System.out.println(arr[c1]);
				c1 = c1 + 1;
			}
			r1++;
		}

		// program 4

		for (int[] row : numbers2) {
			for (int col : row) {
				System.out.println(col);
			}
		}

		// program 5

		String[] cities5 = { "pune", "banglore", "kolkata", "chennai" };

		for (String city : cities5) {
			System.out.println(city);
		}

		String[][] cities6 = { { "pune", "nagpur" }, { "jaipur", "ajmeer" }, { "bhopal", "indore" }

		};
		
		
		for(String [] state:cities6) {
			for(String city:state) {
				System.out.println(city);
			}
		}
		
		System.out.println(cities6[0][1]);
		
		

	}




	}


