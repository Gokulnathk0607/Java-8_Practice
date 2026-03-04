package predicate;

import java.util.function.Predicate;
import java.util.*;

public class Ex2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 25, 30, 15);

        Predicate<Integer> p = n -> n > 20;

        list.stream().filter(p).forEach(System.out::println);
    }
}