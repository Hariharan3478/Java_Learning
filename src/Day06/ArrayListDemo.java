package Day06;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> employees = new ArrayList<>();

        employees.add("Hari");
        employees.add("Arun");
        employees.add("Kumar");
        employees.add("Hari");

        System.out.println(employees);

        System.out.println(employees.get(0));

        employees.set(1, "Rahul");

        employees.remove("Kumar");

        System.out.println("Size: " + employees.size());

        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}