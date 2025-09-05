import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args){

        //TreeSey = unique elements + sorted order
        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(10);
        set.add(30);
        set.add(10);

        System.out.println(set);                //Auto sort the elements , while ignoring the duplicates
    }
    
}
