package Day18;


import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapDemo {

    public static void main(String[] args)
            throws InterruptedException {

        ConcurrentHashMap<String, Integer> inventory =
                new ConcurrentHashMap<>();

        inventory.put("Laptop", 10);
        inventory.put("Mobile", 20);

        Thread t1 = new Thread(() -> {
            inventory.put("Tablet", 15);
        });

        Thread t2 = new Thread(() -> {
            inventory.put("Keyboard", 30);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(inventory);
    }
}

