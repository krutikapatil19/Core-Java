import java.util.*;

public class HashSetExample {                   //HashSet = stores unique elements, no duplicates
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        //Insert 
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);                //duplicate ignored
        numbers.add(30);

        //Display
        System.out.println("Numbers : " + numbers);

        //Search
        System.out.println("Contains 20 ? " + numbers.contains(20));

        //Delete 
        numbers.remove(10);
        System.out.println("After removing : " + numbers);
    }
    
}

//List-> Ordered + duplicates allowed
//Set -> Unordered + No duplicates allowed
//Map -> Key-Value pairs