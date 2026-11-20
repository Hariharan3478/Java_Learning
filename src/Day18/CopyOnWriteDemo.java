package Day18;


import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {

    public static void main(String[] args)
            throws InterruptedException {

        CopyOnWriteArrayList<String> employees =
                new CopyOnWriteArrayList<>();

        employees.add("Arun");
        employees.add("Bala");
        employees.add("Kumar");

        Thread reader = new Thread(() -> {
            for (String employee : employees) {
                System.out.println("Reading: " + employee);
            }
        });

        Thread writer = new Thread(() -> {
            employees.add("Rahul");
            System.out.println("New employee added");
        });

        reader.start();
        writer.start();

        reader.join();
        writer.join();

        System.out.println(employees);
    }
}
