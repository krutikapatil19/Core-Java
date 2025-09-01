import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        //LinkedList = elements linked like a chain
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        list.addFirst(5);                       //add 5 as the first element
        list.addLast(40);                       //add 40 as the last element 

        System.out.println(list);
    }
    
}
