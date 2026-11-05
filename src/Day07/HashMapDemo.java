package Day07;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> employees = new HashMap<>();

        employees.put(101, "Arun");
        employees.put(102, "Kumar");
        employees.put(103, "Ravi");
        employees.put(101, "Hari");

        System.out.println(employees);

        System.out.println(employees.get(102));
        System.out.println(employees.containsKey(103));
        System.out.println(employees.size());

        Map<Integer, String> employees1 = new LinkedHashMap<>();

        employees1.put(101, "Arun");
        employees1.put(102, "Kumar");
        employees1.put(103, "Ravi");
        employees1.put(101, "Hari");

        System.out.println(employees1.entrySet());

        System.out.println(employees1.get(102));
        System.out.println(employees1.containsKey(103));
        System.out.println(employees1.size());
    }
}
