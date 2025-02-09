package hello;

import java.util.TreeSet;

/**
 * The DoubleLinear class implements an algorithm to generate the "dblLinear" sequence.
 * This sequence is defined as follows:
 * - Start with u(0) = 1.
 * - Generate new elements using:
 *   - y = 2 * u(x) + 1
 *   - z = 3 * u(y) + 1
 * - The sequence maintains uniqueness and is sorted in ascending order.
 */
public class DoubleLinear {

    /**
     * Computes the nth element in the "dblLinear" sequence.
     * 
     * @param n The index of the element to retrieve.
     * @return The nth element in the sequence.
     */
    public static int dblLinear(int n) {
        TreeSet<Integer> u = new TreeSet<>();
        u.add(1);

        for (int i = 0; i < n; i++) {
            int current = u.pollFirst(); // Retrieve and remove the smallest element
            u.add(2 * current + 1);
            u.add(3 * current + 1);
        }

        return u.first(); // Get the nth element after n iterations
    }
}
