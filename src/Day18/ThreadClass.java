package Day18;


class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("Executing: " + Thread.currentThread().getName());

    }
}

public class ThreadClass {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.start();
    }
}

