package Day01;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        boolean prime = number >= 2;

        for (int i = 2; i <= number / i && prime; i++) {
            if (number % i == 0) {
                prime = false;
            }
        }

        if (prime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

        sc.close();
    }
}