package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
	
	public static void main(String[] args) {
		
		//1. forEach()
		
		List<String> name = Arrays.asList("Gokul","Nishanth","Gopi");
		name.stream().forEach(System.out::println);
		
		//2.collect()
		
		List<Integer> names = Arrays.asList(22,3,2,1,3,4,7);
		names.stream().collect(Collectors.toList());
		System.out.println(names);
		
		//3.count()
		
		List<Integer> num = Arrays.asList(2,5,4,2,1,4,5,8,9,4,2);
		long counts = num.stream().count();
		System.out.println("\n" +counts);
		
		//4.reduce
		
		List<Integer> number = Arrays.asList(2,4,7,8,9,3);
		int sum = number.stream().reduce(0, Integer::sum);
		System.out.println("\n" +sum);
	}

}
