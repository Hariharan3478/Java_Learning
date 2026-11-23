package Day19;

class Person {

    Person(String name) {
        System.out.println("Person: " + name);
    }
}

class Employee extends Person {

    double salary;

    Employee(String name, double salary) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Name cannot be empty"
            );
        }

        if (salary < 0) {
            throw new IllegalArgumentException(
                    "Invalid salary"
            );
        }

        super(name);

        this.salary = salary;
    }
}

public class FlexibleConstructorDemo {

    public static void main(String[] args) {

        Employee emp =
                new Employee("Hari", 30000);

        System.out.println("Salary: " + emp.salary);
    }
}
