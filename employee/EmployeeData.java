package employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class EmployeeData {

	public static void main(String[] args) {
		
        Emp greet = name -> System.out.println("Hello, " + name);
        greet.sayHello("Gokul");

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("\nIs 10 even? " + isEven.test(10));

        Consumer<String> consumer = msg -> System.out.println("\nConsumer prints: " + msg);
        consumer.accept("Java 8 Consumer");

        Supplier<String> supplier = () -> "\nJava 8 Supplier value";
        System.out.println(supplier.get());

        Function<Integer, Integer> square = n -> n * n;
        System.out.println("\nSquare of 5: " + square.apply(5));

        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
        System.out.println("\nNumbers greater than 15:");
        list.stream().filter(n -> n > 15).forEach(System.out::println);  
        
        System.out.println("\nAll numbers:");
        list.forEach(System.out::println);

        Optional<String> optional = Optional.ofNullable(null);
        System.out.println("\nOptional value: " + optional.orElse("Default Value"));

        System.out.println("\nSquares using Stream are:");
        list.stream().map(n -> n * n).forEach(System.out::println);

	}

}
