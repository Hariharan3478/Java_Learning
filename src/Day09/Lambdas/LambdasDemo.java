package Day09.Lambdas;

interface Square {
    int calculate(int n);
}

public class LambdasDemo{
    public static void main(String[] args) {

        Square square = n -> n * n;

        System.out.println(square.calculate(5));
    }
}