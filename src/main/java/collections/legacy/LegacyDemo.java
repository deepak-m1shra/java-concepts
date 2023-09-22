package collections.legacy;

import java.util.Stack;
import java.util.Vector;

public class LegacyDemo {
    public static void main(String[] args) {

        /**
         * Stacks Demo (Stack extends Vector)
         */

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);

        System.out.println(stack);

        int peeked = stack.peek();
        System.out.println(peeked);

        stack.push(1000);

        int popped = stack.pop();
        System.out.println(popped);

        /**
         * Vector Demo (Vector implements List)
         */

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);

        System.out.println(vector);

        int removed2 = vector.remove(1);
        System.out.println(removed2);

    }
}
