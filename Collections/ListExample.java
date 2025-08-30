import java.util.*;
public class ListExample {
    public static void main(String []args) {
        List<String> fruits = new ArrayList<>();

        //Insert
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");        //duplicates allowed

        //Display
        System.out.println("Fruits : " + fruits);

        //Search
        System.out.println("Contains Banana ? " + fruits.contains("Banana"));

        //Delete
        fruits.remove("Apple");
        System.out.println("After removing : " + fruits);

    }
}
      