package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperation {

	public static void main(String[] args) {
		
		//1.filter 
		
		List<String> names = Arrays.asList("john","Jack","Ragnor");
		List<String> filterNames = names.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());
		System.out.println(filterNames);
		
		//2.Map
		
		List<String> map = Arrays.asList("gokul","john","stark");
		List<String> mapping = map.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("\n" +mapping);
		
		
		//3.sorted
		
		List<Integer> numbers = Arrays.asList(2,3,4,48,92,23);
		List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("\n" +sorted);
		
		//to reverse
		
		List<Integer> num = Arrays.asList(2,3,4,48,92,23);
		List<Integer> reverse = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("\n" +reverse);
		
		//4.distinct
		
		List<Integer> distinctnum = Arrays.asList(3,7,3,28,2,32,88);
		List<Integer> nums = distinctnum.stream().distinct().collect(Collectors.toList());
		System.out.println("\n" +nums);
	}

}
