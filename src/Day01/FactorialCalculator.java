package Day01;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (0-20): ");
        int n = sc.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Please enter a number from 0 to 20.");
        } else {
            long factorial = 1;

            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("Factorial: " + factorial);
        }

        sc.close();
    }
}