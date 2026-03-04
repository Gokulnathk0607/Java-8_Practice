package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
	
	public static void main(String[]args) {
		
		//1.Creating stream from the Collections
		
		List<String> names = Arrays.asList("Gokul", "John", "Tom");
		names.stream().forEach(System.out::println);
		
	
	    //2.Creating stream from Arrays 
	    
	    int[] num = {2,39,48,70,8,9};
	    IntStream numberStream = Arrays.stream(num);
	    numberStream.forEach(System.out::println);
	    
	    
	    //3.Using Stream.of()
	    
	    Stream<String> fruitStream = Stream.of("Banana", "Orange" , "Graphes");
	    fruitStream.forEach(System.out::println);
	    
	    
	    //4.Using Stream.generate()
	    
	    Stream<String> helloStream = Stream.generate(() -> "Hello").limit(5);
	    helloStream.forEach(System.out::println);
	    
	    //5.Using Stream.iterate()
	    
	    Stream<Integer> numStream = Stream.iterate(5, n-> n+2).limit(5);
	    numStream.forEach(System.out::println);
	    
	}
	
	
	
	
}
