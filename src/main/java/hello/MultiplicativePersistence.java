package hello;

public class MultiplicativePersistence {
    public static int calculatePersistence(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input number must be non-negative.");
        }

        int persistenceCount = 0;
        while (n > 9) {
            long product = 1;
            while (n > 0) {
                product *= n % 10;
                n /= 10;
            }
            n = product;
            persistenceCount++;
        }
        return persistenceCount;
    }
}
