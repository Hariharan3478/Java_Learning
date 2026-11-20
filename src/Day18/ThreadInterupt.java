package Day18;


public class ThreadInterupt {

    public static void main(String[] args)
            throws InterruptedException {

        Thread t1 = new Thread(() -> {

            try {

                System.out.println("Worker started");

                Thread.sleep(5000);

                System.out.println("Worker completed");

            } catch (InterruptedException e) {

                System.out.println("Worker interrupted");

            }

        });

        t1.start();

        Thread.sleep(1000);

//        t1.interrupt();

        System.out.println(t1.isInterrupted());
    }
}

