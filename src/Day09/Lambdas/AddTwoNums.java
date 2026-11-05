package Day09.Lambdas;

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

public class AddTwoNums {
    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;

        System.out.println(addition.add(10, 20));
    }
}
