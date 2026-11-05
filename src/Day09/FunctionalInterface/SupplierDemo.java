package Day09.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<Double> randomValue = () -> Math.random();

        System.out.println(randomValue.get());
    }
}