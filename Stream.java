package test2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {

//program 1     
//["ram","shyam","krishna","govinda"]

		List<String> names = Arrays.asList("ram", "shyam", "krishna", "govinda");
		List<String> longNames = names.stream().filter(name -> name.length() > 6).collect(Collectors.toList());
		System.out.println(longNames);

		// program 2

		List<Integer> trans = Arrays.asList(11, 22, 34, -55, 66, -77, -88, 44, 55);
		List<Integer> deposits = trans.stream().filter(t -> t > 0).collect(Collectors.toList());
		System.out.println(deposits);

		List<Integer> withdraws = trans.stream().filter(t -> t > 0).collect(Collectors.toList());
		System.out.println(withdraws);

//program 3
		List<Integer> birthYear = Arrays.asList(1989, 1990, 1991, 1992);
		List<Integer> ages = birthYear.stream().map(x -> 2023 - x).collect(Collectors.toList());
		System.out.println(ages);

		List<Integer> tables = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> twoTable = tables.stream().map(x -> x * 2).collect(Collectors.toList());
		System.out.println(twoTable);

//program 4

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream().reduce(0, (x, y) -> x + y);

		// int[]nums = {11,22,33,44};
		// int total =0;
		// for(int i = 0; i <nums.length;i++){
		// total = total+ nums[i];
		// System.out.println(total);

		List<String> na = Arrays.asList("ram", "shyam", "krishna", "govinda");
		na.stream().forEach(name -> System.out.println("Welcome " + name));

	}
}
