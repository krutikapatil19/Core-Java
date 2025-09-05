import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        //TreeMap = key-value pairs + keys sorted

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(100, "A");
        map.put(50,"B");
        map.put(80,"C");
        map.put(200,"D");

        System.out.println(map);                //sort elements by key values
    }
    
}
