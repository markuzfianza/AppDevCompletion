/**
 * 6 kyu : Multiples of 3 or 5
 * Link : https://www.codewars.com/kata/514b92a657cdc65150000006
 *
 * @author Markuzz Fianza
 * @author Minette Victoria Mandac
 *
 * This class contains a method to calculate the area or perimeter of a rectangle or square.
 */
public class Solution2 {

    /**
     * Finds the sum of all natural numbers below the given number that are divisible
     * by either 3 or 5.
     *
     * @param number the upper limit (non-inclusive)
     * @return the sum of all multiples of 3 or 5 below the number
     */
    public int solution(int number) {
        int sum = 0;
        for (int i = 3; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
