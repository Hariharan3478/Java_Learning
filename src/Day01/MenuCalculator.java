package Day01;

import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Choice: ");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
            } else if (choice >= 1 && choice <= 4) {
                System.out.print("Enter two numbers: ");

                double a = sc.nextDouble();
                double b = sc.nextDouble();

                switch (choice) {
                    case 1 -> System.out.println("Result: " + (a + b));
                    case 2 -> System.out.println("Result: " + (a - b));
                    case 3 -> System.out.println("Result: " + (a * b));
                    case 4 -> {
                        if (b == 0) {
                            System.out.println("Cannot divide by zero.");
                        } else {
                            System.out.println("Result: " + (a / b));
                        }
                    }
                    default -> { }
                }
            } else {
                System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}