import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBenchmark {
    public static void main(String[] args) {
        int size = 10_000_000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Map<Integer, Integer> hashMap = new HashMap<>();

        long start;

        // ArrayList Add
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) arrayList.add(i);
        System.out.println("ArrayList add: " + (System.currentTimeMillis() - start) + "ms");

        // LinkedList Add
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) linkedList.add(i);
        System.out.println("LinkedList add: " + (System.currentTimeMillis() - start) + "ms");

        // HashSet Add
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) hashSet.add(i);
        System.out.println("HashSet add: " + (System.currentTimeMillis() - start) + "ms");

        // HashMap Add
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) hashMap.put(i, i);
        System.out.println("HashMap add: " + (System.currentTimeMillis() - start) + "ms");

        // Truy cập ArrayList
        start = System.currentTimeMillis();
        int x = arrayList.get(size / 2);
        System.out.println("ArrayList get middle: " + (System.currentTimeMillis() - start) + "ms");

        // Truy cập LinkedList
        start = System.currentTimeMillis();
        int y = linkedList.get(size / 2);
        System.out.println("LinkedList get middle: " + (System.currentTimeMillis() - start) + "ms");

        // HashMap get
        start = System.currentTimeMillis();
        int z = hashMap.get(size / 2);
        System.out.println("HashMap get: " + (System.currentTimeMillis() - start) + "ms");
    }
}
