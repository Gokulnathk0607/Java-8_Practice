package java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filternum_less50 {
	
	public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(20, 45, 60, 30, 80);

        Predicate<Integer> lessThanFifty = n -> n < 50;

        Function<Integer, Integer> addTen = n -> n + 10;

        Consumer<Integer> print = n -> System.out.println("Updated value: " + addTen.apply(n));

        numbers.stream().filter(lessThanFifty).forEach(print);
    }

}
