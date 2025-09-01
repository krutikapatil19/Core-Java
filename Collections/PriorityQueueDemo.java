import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //PriorityQueue = smallest element comes first (min-heap)

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        
        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
    
}
