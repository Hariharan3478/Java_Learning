package Day11;


import java.nio.file.*;
import java.util.*;
import java.io.IOException;

class Employe {

    int id;
    String name;
    String department;
    double salary;

    Employe(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toCSV() {
        return id + "," + name + "," + department + "," + salary;
    }
}

public class CSVProcessing {

    public static void main(String[] args) {

        Path input = Paths.get("employees.csv");
        Path output = Paths.get("updated_employees.csv");

        try {

            // Step 1: Read CSV file
            List<String> lines = Files.readAllLines(input);

            List<Employe> employees = new ArrayList<>();

            // Step 2: Convert CSV rows into objects
            for (int i = 1; i < lines.size(); i++) {

                String[] data = lines.get(i).split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                Employe emp = new Employe(
                        id, name, department, salary
                );

                employees.add(emp);
            }

            // Step 3: Transform salary
            for (Employe emp : employees) {
                emp.salary = emp.salary * 1.10;
            }

            // Step 4: Write transformed data
            List<String> result = new ArrayList<>();

            result.add("id,name,department,salary");

            for (Employe emp : employees) {
                result.add(emp.toCSV());
            }

            Files.write(output, result);

            System.out.println("CSV transformation completed!");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

