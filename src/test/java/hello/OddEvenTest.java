package hello;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    void testEvenNumber() {
        assertTrue(OddEven.oddOrEven(2).contains("Even"));
    }

    @Test
    void testOddNumber() {
        assertTrue(OddEven.oddOrEven(3).contains("Odd"));
    }

    @Test
    void testZero() {
        assertTrue(OddEven.oddOrEven(0).contains("Even")); // 0 is even
    }

    @Test
    void testNegativeEvenNumber() {
        assertTrue(OddEven.oddOrEven(-4).contains("Even"));
    }

    @Test
    void testNegativeOddNumber() {
        assertTrue(OddEven.oddOrEven(-7).contains("Odd"));
    }
}

