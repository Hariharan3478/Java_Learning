package Day09.FunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<String, Integer> getLength = s -> s.length();

        System.out.println(getLength.apply("Java"));
    }
}