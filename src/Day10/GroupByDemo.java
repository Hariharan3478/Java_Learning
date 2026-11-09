package Day10;

import java.util.*;
import java.util.stream.*;

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
}

public class GroupByDemo {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Arun", "IT", 50000),
                new Employee(2, "Bala", "HR", 30000),
                new Employee(3, "Kumar", "IT", 60000),
                new Employee(4, "Ravi", "HR", 35000),
                new Employee(5, "David", "Finance", 45000)
        );

        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(e -> e.department));

        grouped.forEach((department, list) -> {
            System.out.println(department);

            list.forEach(e -> System.out.println(e.name));
        });
    }
}