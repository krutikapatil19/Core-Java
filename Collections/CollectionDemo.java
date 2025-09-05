import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        //Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        //Add elements into the ArrayList
        names.add("Krutika");
        names.add("Amit");
        names.add("Vaish");

        System.out.println("ArrayList elements:" + names);

        //Access elements one by one
        System.out.println(" Printing names one by one :");
        for(String n : names) {
            System.out.println(n);
        }
    }
}
