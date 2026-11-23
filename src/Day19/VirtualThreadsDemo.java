package Day19;

public class VirtualThreadsDemo {
    public static void main(String[] args)
            throws InterruptedException {

        Thread[] threads = new Thread[1000];

        for (int i = 0; i < 1000; i++) {
            int taskId = i;

            threads[i] = Thread.startVirtualThread(() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Task: " + taskId);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("All tasks completed");
    }
}
