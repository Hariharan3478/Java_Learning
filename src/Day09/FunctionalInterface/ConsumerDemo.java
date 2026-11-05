package Day09.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<String> print = name ->
                System.out.println("Hello " + name);

        print.accept("Hari");
    }
}
