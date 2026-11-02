package Day06;

class InvalidSalaryException extends Exception {

    public InvalidSalaryException(String message) {
        super(message);
    }
}

public class CustomException {

    static void validateSalary(double salary)
            throws InvalidSalaryException {

        if (salary <= 0) {
            throw new InvalidSalaryException(
                    "Salary must be greater than zero!"
            );
        }

        System.out.println("Valid salary: " + salary);
    }

    public static void main(String[] args) {

        try {
            validateSalary(0);

        } catch (InvalidSalaryException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
