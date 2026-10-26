package Day01;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Before: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("With temp: a = " + a + ", b = " + b);

        a = 10;
        b = 20;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Without temp: a = " + a + ", b = " + b);
    }
}
