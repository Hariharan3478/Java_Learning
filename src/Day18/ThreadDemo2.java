package Day18;


public class ThreadDemo2 {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                System.out.println("Downloading file " + i);
            }

        });

        Thread t2 = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                System.out.println("Processing file " + i);
            }

        });

        t1.start();
        t2.start();


        System.out.println("Main thread completed");
    }
}

