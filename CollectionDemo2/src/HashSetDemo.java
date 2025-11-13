
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("Nayan");
        hashSet.add("Pratik");
        hashSet.add("Rohit");
        hashSet.add("Virat");
        hashSet.add("Kiran");

        System.out.println("without sorting>>" +hashSet);

        TreeSet treeSet = new TreeSet(hashSet);
        System.out.println("After sorting>>" +treeSet);

    }
}
