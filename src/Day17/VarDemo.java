package Day17;

import java.util.ArrayList;

public class VarDemo {

    public static void main(String[] args) {

        var name = "Hari";
        var age = 22.0;
        var salary = 25000.50;
        var active = true;

        var employees = new ArrayList<String>();

        employees.add("Hari");
        employees.add("Arun");
        employees.add("Rahul");

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(active);
        System.out.println(employees);
    }
}
