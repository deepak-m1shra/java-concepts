package collections.misc;

import java.util.*;

public class Experiments {
    public static void main(String[] args) {
        // Working with SortedSet implementation TreeSet
        TreeSet<Integer>  treeSet = new TreeSet<>();
        treeSet.add(100);
        treeSet.add(50);
        treeSet.add(1);

        // Output is [1, 50, 100]
        System.out.println(treeSet);

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 1000);
        treeMap.put("Aeroplane", 2000);
        treeMap.put("Lion", 3000);
        treeMap.put("Penguin", 20);

        // Natural ordering of keys, alphabetical order in this case
        // Use Collections.reverseOrder(), for descending order
        System.out.println(treeMap);

        Queue<Integer> pq = new LinkedList<>();
        pq.add(123);
        pq.add(234);

        pq.poll();
        pq.poll();
        pq.poll();

        System.out.println(pq);

        // The following will throw exception
        // pq.remove();

    }
}
