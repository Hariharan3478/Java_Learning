package Day07;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> students = new TreeMap<>();

        students.put(103, "Arun");
        students.put(101, "Kumar");
        students.put(102, "Ravi");

        System.out.println(students);
    }
}
