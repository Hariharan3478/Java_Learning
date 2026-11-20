package Day18;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class InventoryProcessing {

    public static void main(String[] args)
            throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int productId = i;
            executor.submit(() -> {
                System.out.println("Product " + productId + " processing started by " + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("Product " + productId + " inventory updated successfully");
            });
        }

        executor.shutdown();

        if (executor.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("All inventory updates completed!");
        }
        else {
            System.out.println("Processing timeout reached!");
        }
    }
}

