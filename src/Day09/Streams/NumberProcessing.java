package Day09.Streams;

import java.util.*;
import java.util.stream.*;

public class NumberProcessing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10, 15, 20, 25, 30, 35, 40, 45, 50, 10, 20
        );

        // Print all numbers
        numbers.stream()
                .forEach(System.out::println);

        // Find even numbers
        List<Integer> even = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even: " + even);

        // Find numbers greater than 25
        List<Integer> greater = numbers.stream()
                .filter(n -> n > 25)
                .collect(Collectors.toList());

        System.out.println("Greater than 25: " + greater);

        // Square every number
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Squares: " + squares);

        // Remove duplicates
        List<Integer> unique = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique: " + unique);

        // Sort ascending
        List<Integer> ascending = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending: " + ascending);

        // Sort descending
        List<Integer> descending = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Descending: " + descending);

        // Find sum
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);

        // Find maximum
        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);

        System.out.println("Maximum: " + max);

        // Find minimum
        int min = numbers.stream()
                .min(Integer::compareTo)
                .orElse(0);

        System.out.println("Minimum: " + min);

        // Count numbers divisible by 5
        long count = numbers.stream()
                .filter(n -> n % 5 == 0)
                .count();

        System.out.println("Count: " + count);

        // Find second highest unique number
        int secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println("Second highest: " + secondHighest);

        //  Check conditions
        System.out.println(numbers.stream().allMatch(n -> n > 0));
        System.out.println(numbers.stream().anyMatch(n -> n > 45));
        System.out.println(numbers.stream().noneMatch(n -> n < 0));

        // 14. Average
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Average: " + average);
    }
}