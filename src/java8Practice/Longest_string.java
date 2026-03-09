package java8Practice;

import java.util.Arrays;
import java.util.List;

public class Longest_string {
	
	 public static void main(String[] args) {

	        List<String> words = Arrays.asList("Nisha", "Kumarasami", "Praveen", "Pooja");

	        String longest = words.stream().max((a, b) -> a.length() - b.length()).get();

	        System.out.println("Longest word: " + longest);
	    }

}
