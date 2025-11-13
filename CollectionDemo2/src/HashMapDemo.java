import java.util.HashMap;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(20, "Nayan");
        map.put(40, "Rohan");
        map.put(10, "Rohit");
        map.put(50, "Sahil");
        map.put(70, "Vipul");

        System.out.println("Without sorting>>" + map);

        TreeMap<Integer, String> treeMap = new TreeMap<>(map);

        System.out.println("After sorting>>" + treeMap);

    }
}
