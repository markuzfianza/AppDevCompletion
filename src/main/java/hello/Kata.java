/**
 * 8 kyu : Sum of a Sequence
 * Link : https://www.codewars.com/kata/586f6741c66d18c22800010a
 *
 * @author Markuzz Fianza
 * @author Minette Victoria Mandac
 *
 * This class contains a method to calculate the sum of a sequence of numbers.
 */
public class Kata {

    /**
     * Calculates the sum of numbers in a sequence starting from 'start', ending at 'end',
     * and incrementing by 'step'.
     *
     * @param start the starting number of the sequence
     * @param end the last number of the sequence
     * @param step the increment between numbers in the sequence
     * @return the sum of the sequence of numbers
     */
    public static int sequenceSum(int start, int end, int step) {
        int count = 0;
        for (int i = start; i <= end; i += step) {
            count += i;
        }
        return count;
    }
}
