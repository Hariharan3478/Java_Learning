package Day09.Streams;

import java.util.*;
import java.util.stream.*;

public class StringProcessing {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Arun", "Bala", "Kumar", "Anand",
                "Ajay", "Ravi", "Arun", "Karthik"
        );

        // Names starting with A
        names.stream()
                .filter(n -> n.startsWith("A"))
                .forEach(System.out::println);

        // Convert to uppercase
        List<String> upper = names.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(upper);

        // Sort names
        names.stream()
                .sorted()
                .forEach(System.out::println);

        //  Remove duplicate names
        List<String> unique = names.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unique);

        // Find longest name
        String longest = names.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println("Longest: " + longest);

        // Join all names
        String joined = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println(joined);

        //Find names containing 'a'
        names.stream()
                .filter(n -> n.toLowerCase().contains("a"))
                .forEach(System.out::println);

        // Count names starting with A
        long count = names.stream()
                .filter(n -> n.startsWith("A"))
                .count();

        System.out.println("A names: " + count);

        // Character count of each name
        Map<String, Integer> lengths = names.stream()
                .distinct()
                .collect(Collectors.toMap(
                        name -> name,
                        String::length
                ));

        System.out.println(lengths);

        // Word frequency
        Map<String, Long> frequency = names.stream()
                .collect(Collectors.groupingBy(
                        name -> name,
                        Collectors.counting()
                ));

        System.out.println(frequency);


    }
}