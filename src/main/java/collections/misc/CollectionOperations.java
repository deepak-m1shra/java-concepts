package collections.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionOperations {
    public static void main(String[] args) {

       /** Making a collection read-only
        1. Using List.of (returns an unmodifiable list)
        2. Use unmodifiable
        **/

        List<Integer> finalList = List.of(1,2,3);
        // The following will throw "UnsupportedOperationException"
        //  finalList.add(4);

        List<Integer> modifiableList = new ArrayList<>();
        modifiableList.add(8);
        modifiableList.add(9);

        System.out.println(modifiableList);

        // Making the modifiableList as unmodifiable list

        var unmodifiableList = Collections.unmodifiableCollection(modifiableList);

        // The following will throw exception
        // unmodifiableList.add(10);

        System.out.println(unmodifiableList);

        // Trying to add to the list that backs the list above (it is allowed)
        modifiableList.add(1000);

        /** Making a collection Thread-Safe
         **/

        var threadSafeList = Collections.synchronizedList(modifiableList);

        System.out.println(threadSafeList);
        System.out.println(threadSafeList.getClass().getCanonicalName());

    }
}
