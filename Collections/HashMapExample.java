import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        //Insert
        students.put(1,"Krutika");
        students.put(2,"Amit");
        students.put(3, "Sakshi");

        //Display
        System.out.println("Students : " + students);

        //Search
        System.out.println("Roll 2 : " + students.get(2));

        //Delete
        students.remove(3);
        System.out.println("After removing : " + students);
    }
    
}


//List-> Ordered + duplicates allowed
//Set -> Unordered + No duplicates allowed
//Map -> Key-Value pairs