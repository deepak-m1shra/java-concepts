package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentCollections {
    public static void main(String[] args) {
        /**
         * We can modify the concurrent collections unlike the regular counterparts
         * where-in if we modify the collection, exception is thrown (ConcurrentModificationException)
         */

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");

        // Adding while iterating (causes ConcurrentModificationException)
        //  for(String str : arrayList) {
        //  arrayList.add("blah..");
        //  }

        // Removing while iterating (causes ConcurrentModificationException)
        // for(String str: arrayList) {
        //  arrayList.remove("One");
        //  }

        // If an element doesn't exist, and we try to remove it, we don't get any exception
        // as the underlying structure remains unchanged

        System.out.println(arrayList);

        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
    }
}
