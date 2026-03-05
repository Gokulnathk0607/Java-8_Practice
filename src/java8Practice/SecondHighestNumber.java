package java8Practice;

import java.util.Arrays;
import java.util.List;

public class SecondHighestNumber {
	
	public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 40, 30, 20, 50);

        int secondHighest = numbers.stream().sorted((a, b) -> b - a).skip(1).findFirst().get();

        System.out.println("Second Highest: " + secondHighest);

}
}
