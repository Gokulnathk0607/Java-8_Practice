package java8Practice;
import java.util.*;

public class Sort_String_Length {
	
	public static void main(String[] args) {

        List<String> words = Arrays.asList("John", "Ruby", "Harish", "Hendry");

        words.sort((a, b) -> a.length() - b.length());

        System.out.println(words);

}
}
