import java.util.*;
public class ArrayListExample {
    public static void main(String []args) {
        List<String> fruits = new ArrayList<>();                              //ArrayList = resizable array 

        //Insert
        fruits.add("Apple");                                                //add elements 
        fruits.add("Banana");
        fruits.add("Apple");        //duplicates are allowed
        fruits.add("Pineapple");

        //Display
        System.out.println("Fruits : " + fruits);                             //print list 

        //Search
        System.out.println("Contains Banana ? " + fruits.contains("Banana"));

        //Delete
        fruits.remove("Apple");
        System.out.println("After removing : " + fruits);

    }
}
      
//List-> Ordered + duplicates allowed
//Set -> Unordered + No duplicates allowed
//Map -> Key-Value pairs