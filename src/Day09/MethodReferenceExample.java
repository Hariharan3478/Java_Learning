package Day09;

import java.util.*;
import java.util.function.*;

class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(
                id + " | " + name + " | " + salary
        );
    }

    static void printEmployee(Employee e) {
        System.out.println(e.name);
    }

    double getSalary() {
        return salary;
    }
}

public class MethodReferenceExample {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Hari", 50000));
        employees.add(new Employee(102, "Arun", 60000));
        employees.add(new Employee(103, "Rahul", 45000));

        Employee first = employees.get(0);
        Runnable task = first::display;
        task.run();

        employees.forEach(Employee::printEmployee);

        employees.sort(
                Comparator.comparing(Employee::getSalary)
        );

        employees.forEach(e ->
                System.out.println(e.name + " " + e.salary)
        );
    }
}