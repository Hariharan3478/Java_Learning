package Day07;

import java.util.*;

public class LinkedHashMapDemo{
    public static void main(String[] args) {

        Map<Integer, String> students = new LinkedHashMap<>();

        students.put(3, "Arun");
        students.put(1, "Kumar");
        students.put(2, "Ravi");

        System.out.println(students);
    }
}