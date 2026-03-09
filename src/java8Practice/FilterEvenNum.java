package java8Practice;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNum {
	
		    public static void main(String[] args) {

		        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);

		        numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(System.out::println);
		    }

	}
