package Day01;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a nonnegative integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a nonnegative number.");
        } else {
            int sum = 0;

            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            System.out.println("Sum: " + sum);
        }

        sc.close();
    }
}
