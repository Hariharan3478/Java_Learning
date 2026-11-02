package Day06;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        Set<Integer> numbers = new LinkedHashSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        System.out.println(numbers);
    }
}
