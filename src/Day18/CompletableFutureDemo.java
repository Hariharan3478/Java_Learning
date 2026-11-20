package Day18;


import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

    public static void main(String[] args) {

        System.out.println("Main thread started");

        CompletableFuture<Void> future =
                CompletableFuture.runAsync(() -> {

                    System.out.println("Task running on: " + Thread.currentThread().getName());

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Task completed");

                });

        System.out.println("Main thread continues");

        future.join();

        System.out.println("Main thread finished");
    }
}
