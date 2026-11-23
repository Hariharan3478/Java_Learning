package Day19;

import java.util.concurrent.*;

public class PlatformThreadVSVirtualThread {

    static void runTasks(ExecutorService executor)
            throws InterruptedException {

        long start = System.nanoTime();

        try (executor) {
            for (int i = 0; i < 1000; i++) {
                executor.submit(() -> {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }

            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.MINUTES);
        }

        long end = System.nanoTime();

        System.out.println(
                "Time: " + (end - start) / 1_000_000 + " ms"
        );
    }

    public static void main(String[] args)
            throws InterruptedException {

        System.out.println("Platform Threads");

        runTasks(Executors.newFixedThreadPool(100));

        System.out.println("Virtual Threads");

        runTasks(Executors.newVirtualThreadPerTaskExecutor());
    }
}
