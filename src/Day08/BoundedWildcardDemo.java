package Day08;

import java.util.*;

public class BoundedWildcardDemo {

    public static double calculateSum(
            List<? extends Number> numbers) {

        double sum = 0;

        for (Number number : numbers) {

            sum += number.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(10, 20, 30);

        List<Double> decimals = Arrays.asList(10.5, 20.5, 30.5);

        List<Float> floats = Arrays.asList(1.5f, 2.5f, 3.5f);

        System.out.println(calculateSum(integers));

        System.out.println(calculateSum(decimals));

        System.out.println(calculateSum(floats));
    }
}
