package Day10;

import java.util.*;
import java.util.stream.*;

public class FlatMapDemo {
    public static void main(String[] args) {

        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(10, 20),
                Arrays.asList(30, 40),
                Arrays.asList(50, 60)
        );

        List<Integer> result = numbers.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
