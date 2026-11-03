package Day07;

import java.util.*;

public class DequeDemo {
    public static void main(String[] args) {

        Deque<String> tasks = new ArrayDeque<>();

        tasks.addFirst("Task 1");
        tasks.addLast("Task 2");
        tasks.addFirst("Urgent Task");

        System.out.println(tasks);

        System.out.println("First: " + tasks.peekFirst());
        System.out.println("Last: " + tasks.peekLast());

        tasks.removeFirst();
        tasks.removeLast();

        System.out.println(tasks);
    }
}
