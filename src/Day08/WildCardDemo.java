package Day08;

import java.util.Arrays;
import java.util.List;

public class WildCardDemo{

    public static void display(List<?> list) {

        for (Object value : list) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Hari", "Sukish", "Kishore");

        List<Integer> numbers =
                Arrays.asList(10, 20, 30);

        List<Double> prices =
                Arrays.asList(10.5, 20.5, 30.5);

        display(names);

        display(numbers);

        display(prices);
    }
}
