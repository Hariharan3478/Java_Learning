package Day18;


public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(
                "Main: " + Thread.currentThread().getName()
        );

        Thread t1 = new Thread(() -> {

            System.out.println(
                    "Worker: " + Thread.currentThread().getName()
            );

        });

        t1.start();
        t1.sleep(3000);

        System.out.println("Main Completed");
    }
}

