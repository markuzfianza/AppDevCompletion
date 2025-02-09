package hello;
/**
 * 5 Kyu : Gap in Primes
 * Link : https://www.codewars.com/kata/561e9c843a2ef5a40c0000a4
 *
 * @author Markuzz Fianza
 * @author Minette Victoria Mandac
 *
 * This class contains methods to find the gap between two consecutive prime numbers within a range.
 */
public class GapInPrimes {

    /**
     * Finds two prime numbers within the range [m, n] that have a specified gap.
     *
     * @param g the gap between two consecutive prime numbers
     * @param m the start of the range (inclusive)
     * @param n the end of the range (inclusive)
     * @return an array containing the two prime numbers with the gap g, or null if no such pair exists
     */
    public static long[] gap(int g, long m, long n) {
        for (long i = m; i <= n; i++) {
            long nextPrime;
            if (isPrime(i) && (nextPrime = generateNextPrime(i, n)) != -1) {
                if (nextPrime - i == g) {
                    return new long[]{i, nextPrime};
                }
                i = nextPrime - 1;
            }
        }
        return null;
    }

    /**
     * Checks if a number is prime.
     *
     * @param i the number to check
     * @return true if the number is prime, false otherwise
     */
    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Generates the next prime number after a given start number.
     *
     * @param START the starting number (exclusive)
     * @param END the end limit (inclusive)
     * @return the next prime number, or -1 if none is found
     */
    private static long generateNextPrime(final long START, final long END) {
        for (long i = START + 1; i <= END; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        long[] res = gap(6, 100, 110);
        for (long el : res != null ? res : new long[0]) {
            System.out.print(el + " ");
        }
    }
}

