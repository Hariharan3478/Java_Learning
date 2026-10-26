package Day01;

public class EmployeeConstructorDemo {

    static class Employee {
        private final int id;
        private final String name;
        private final double salary;

        Employee(int id, String name, double salary) {
            if (salary < 0) {
                throw new IllegalArgumentException(
                        "Salary cannot be negative"
                );
            }

            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        double calculateBonus() {
            return salary * 0.10;
        }

        void displayDetails() {
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
            System.out.println("Bonus: " + calculateBonus());
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Hariharan", 50000);
        Employee e2 = new Employee(102, "Arun", 60000);

        e1.displayDetails();

        System.out.println();

        e2.displayDetails();
    }
}
