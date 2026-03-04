package stream;

import java.util.*;
import java.util.stream.Collectors;

public class List_to_Set {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 20, 30);

        Set<Integer> set = numbers.stream()
                                  .collect(Collectors.toSet());

        System.out.println(set);

	}

}
