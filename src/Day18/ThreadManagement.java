package Day18;


public class ThreadManagement {

    public static void main(String[] args)
            throws InterruptedException {

        // Main Thread
        System.out.println("Main Thread: " + Thread.currentThread().getName());

        // Worker Thread 1
        Thread download = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                System.out.println(Thread.currentThread().getName() + " - Downloading file " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

        });

        // Worker Thread 2
        Thread process = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                System.out.println(Thread.currentThread().getName() + " - Processing file " + i);

                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

        });

        // Thread Naming
        download.setName("Download-Thread");
        process.setName("Processing-Thread");

        // Thread Priority
        download.setPriority(Thread.MAX_PRIORITY);
        process.setPriority(Thread.NORM_PRIORITY);

        // Daemon Thread
        Thread background = new Thread(() -> {

            while (!Thread.currentThread().isInterrupted()) {

                System.out.println("Background monitoring...");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

        });

        background.setName("Monitor-Thread");
        background.setDaemon(true);

        // Start Threads
        download.start();
        process.start();
        background.start();

        // Wait for worker threads
        download.join();
        process.join();

        System.out.println("All files processed!");
    }
}

