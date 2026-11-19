package Day17;

import java.util.Scanner;

public class SwitchExpressions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = switch (operator) {

            case '+' -> num1 + num2;

            case '-' -> num1 - num2;

            case '*' -> num1 * num2;

            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    yield 0;
                }
                yield num1 / num2;
            }

            default -> {
                System.out.println("Invalid operator!");
                yield 0;
            }
        };

        System.out.println("Result: " + result);

        sc.close();
    }
}