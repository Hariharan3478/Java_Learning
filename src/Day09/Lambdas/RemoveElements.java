package Day09.Lambdas;

import java.util.*;

public class RemoveElements {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30, 35));

        numbers.removeIf(n -> n % 2 != 0);

        System.out.println(numbers);
    }
}
