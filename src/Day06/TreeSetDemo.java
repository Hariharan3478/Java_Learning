package Day06;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetDemo {

    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        System.out.println(numbers);
    }
}