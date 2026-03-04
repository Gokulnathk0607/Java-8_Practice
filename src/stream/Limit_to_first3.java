package stream;

import java.util.Arrays;
import java.util.List;

public class Limit_to_first3 {

	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(10, 30, 50, 70, 90);

	        numbers.stream()
	               .limit(3)
	               .forEach(System.out::println);

	}

}
