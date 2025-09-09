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

//Deque - Double ended queue - in Java is an interface in the Collection Framework that allows insertion and deletion from both ends. 
//It is implemented mainly by ArrayDeque and LinkedList, and is widely used in undo/redo, browser navigation and task scheduling.