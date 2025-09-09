import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();

        //Adding elements
        dq.addFirst("Joe");
        dq.addLast("John");
        dq.addFirst("Ziva");
        dq.addLast("Stormy");

        System.out.println("Deque: " + dq);

        //Removing elements
        dq.removeFirst();
        dq.removeLast();

        System.out.println("After removals: " + dq);
    }
}