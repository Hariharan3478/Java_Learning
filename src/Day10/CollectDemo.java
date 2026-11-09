package Day10;

import java.util.*;
import java.util.stream.*;

public class CollectDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        List<Integer> list = numbers.stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());

        System.out.println(list);

        Set<Integer> set = numbers.stream()
                .collect(Collectors.toSet());

        System.out.println(set);

        String result = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
