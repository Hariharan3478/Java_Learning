package Day09.Lambdas;


import java.util.*;

class Employee {

    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + " | " + name + " | " + department + " | " + salary;
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Arun", "IT", 50000));
        employees.add(new Employee(102, "Bala", "HR", 40000));
        employees.add(new Employee(103, "Charan", "IT", 70000));
        employees.add(new Employee(104, "David", "Finance", 60000));
        employees.add(new Employee(105, "Ezhil", "HR", 55000));

        // Print all employees
        System.out.println("All Employees:");

        employees.forEach(e -> System.out.println(e));

        // Filter salary above 50000
        System.out.println("\nHigh Salary Employees:");

        employees.forEach(e -> {
            if (e.salary > 50000) {
                System.out.println(e);
            }
        });

        // Filter IT department
        System.out.println("\nIT Employees:");

        employees.forEach(e -> {
            if (e.department.equals("IT")) {
                System.out.println(e);
            }
        });

        //Sort by salary ascending
        employees.sort((e1, e2) ->
                Double.compare(e1.salary, e2.salary));

        System.out.println("\nSalary Ascending:");

        employees.forEach(System.out::println);

        // Sort by salary descending
        employees.sort((e1, e2) ->
                Double.compare(e2.salary, e1.salary));

        System.out.println("\nSalary Descending:");

        employees.forEach(System.out::println);

        // Sort by department and then name
        employees.sort(
                Comparator.comparing((Employee e) -> e.department)
                        .thenComparing(e -> e.name)
        );

        System.out.println("\nDepartment and Name:");

        employees.forEach(System.out::println);
    }
}

