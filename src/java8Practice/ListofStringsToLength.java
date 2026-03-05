package java8Practice;

import java.util.Arrays;
import java.util.List;

public class ListofStringsToLength {
	
	public static void main(String[] args) {

        List<String> names = Arrays.asList("Gokul", "Nishanth", "Gopi");

        names.stream()
             .map(name -> name.length())
             .forEach(System.out::println);

}
}