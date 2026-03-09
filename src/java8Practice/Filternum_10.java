package java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filternum_10 {
	
	public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);

        Predicate<Integer> greaterThanTen = n -> n > 10;

        Function<Integer, Integer> doubleValue = n -> n * 2;

        Consumer<Integer> print = n -> System.out.println("Result: " + doubleValue.apply(n));

        numbers.stream().filter(greaterThanTen).forEach(print);
    }

}
