package Day10;

import java.util.*;
import java.util.stream.*;

public class PartitionByDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50, 65);

        Map<Boolean, List<Integer>> result = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n >= 40));

        System.out.println("Above 40: " + result.get(true));
        System.out.println("Below 40: " + result.get(false));
    }
}