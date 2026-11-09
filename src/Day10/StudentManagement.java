package Day10;

import java.util.*;
import java.util.stream.*;

class Student {

    int id;
    String name;
    String department;
    double marks;

    Student(int id, String name, String department, double marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    public String toString() {
        return id + " | " + name + " | " +
                department + " | " + marks;
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Arun", "IT", 85));
        students.add(new Student(2, "Bala", "CSE", 45));
        students.add(new Student(3, "Kumar", "IT", 92));
        students.add(new Student(4, "Ravi", "ECE", 35));
        students.add(new Student(5, "David", "CSE", 75));

        // 1. Display all students
        System.out.println("ALL STUDENTS");

        students.forEach(System.out::println);


        // 2. Search student by ID
        System.out.println("\nSEARCH BY ID");

        Optional<Student> student = students.stream()
                .filter(s -> s.id == 3)
                .findFirst();

        System.out.println(student.orElse(null));


        // 3. Search student by name
        System.out.println("\nSEARCH BY NAME");

        students.stream()
                .filter(s -> s.name.equalsIgnoreCase("Arun"))
                .forEach(System.out::println);


        // 4. Sort by marks (Descending)
        System.out.println("\nSORT BY MARKS");

        students.stream()
                .sorted(Comparator.comparingDouble(
                        (Student s) -> s.marks).reversed())
                .forEach(System.out::println);


        // 5. Group by department
        System.out.println("\nGROUP BY DEPARTMENT");

        Map<String, List<Student>> groups = students.stream()
                .collect(Collectors.groupingBy(s -> s.department));

        groups.forEach((department, list) -> {
            System.out.println(department);
            list.forEach(System.out::println);
        });


        // 6. Partition passed and failed students
        System.out.println("\nPASS / FAIL");

        Map<Boolean, List<Student>> result = students.stream()
                .collect(Collectors.partitioningBy(s -> s.marks >= 40));

        System.out.println("Passed:");

        result.get(true).forEach(System.out::println);

        System.out.println("Failed:");

        result.get(false).forEach(System.out::println);


        // 7. Average marks
        double average = students.stream()
                .collect(Collectors.averagingDouble(s -> s.marks));

        System.out.println("\nAverage Marks: " + average);


        // 8. Highest marks
        Optional<Student> highest = students.stream()
                .max(Comparator.comparingDouble(s -> s.marks));

        System.out.println("Highest: " + highest.orElse(null));


        // 9. Lowest marks
        Optional<Student> lowest = students.stream()
                .min(Comparator.comparingDouble(s -> s.marks));

        System.out.println("Lowest: " + lowest.orElse(null));


        // 10. Count students in each department
        Map<String, Long> count = students.stream()
                .collect(Collectors.groupingBy(
                        s -> s.department,
                        Collectors.counting()
                ));

        System.out.println("\nDepartment Count: " + count);


        // 11. Collect only student names
        List<String> names = students.stream()
                .map(s -> s.name)
                .collect(Collectors.toList());

        System.out.println("\nStudent Names: " + names);
    }
}
