package Day08;

class Calculator<T extends Number> {

    private T number;

    Calculator(T number) {
        this.number = number;
    }

    public double square() {

        double value = number.doubleValue();

        return value * value;
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator<Integer> c1 = new Calculator<>(10);

        Calculator<Double> c2 = new Calculator<>(5.5);

        Calculator<Float> c3 = new Calculator<>(4.5f);

        Calculator<Long> c4 = new Calculator<>(20L);

        System.out.println(c1.square());
        System.out.println(c2.square());
        System.out.println(c3.square());
        System.out.println(c4.square());

//         Calculator<String> c5 = new Calculator<>("Java");
    }
}
