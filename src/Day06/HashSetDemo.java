package Day06;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<String> employees = new HashSet<>();

        employees.add("Hari");
        employees.add("Arun");
        employees.add("Kumar");
        employees.add("Hari");

        System.out.println(employees);
    }
}