package java8Practice;
import java.util.*;

public class MinNum_in_List {
	
	public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(15, 8, 20, 3, 10);

        int min = numbers.stream().min((a, b) -> a.compareTo(b)).get();

        System.out.println("Minimum: " + min);

}
}
