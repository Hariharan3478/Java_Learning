package Day18;


public class SynchronizedRaceCondition {

    static int balance = 1000;

    public static synchronized void withdraw() {

        if (balance >= 700) {

            System.out.println(Thread.currentThread().getName() + " is withdrawing 700");

            balance = balance - 700;

            System.out.println("Remaining balance: " + balance);

        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(SynchronizedRaceCondition::withdraw, "Thread-1");
        Thread t2 = new Thread(SynchronizedRaceCondition::withdraw, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final balance: " + balance);
    }
}

