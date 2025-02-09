package hello;

import hello.CreatePhoneNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreatePhoneNumberTest {

    @Test
    void testValidPhoneNumber() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String expected = "(123) 456-7890";
        assertEquals(expected, CreatePhoneNumber.createPhoneNumber(input));
    }

    @Test
    void testAnotherValidPhoneNumber() {
        int[] input = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        String expected = "(987) 654-3210";
        assertEquals(expected, CreatePhoneNumber.createPhoneNumber(input));
    }

    @Test
    void testNullInputThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CreatePhoneNumber.createPhoneNumber(null);
        });
        assertEquals("Input array must contain exactly 10 digits.", exception.getMessage());
    }

    @Test
    void testShortInputThrowsException() {
        int[] input = {1, 2, 3, 4, 5}; // Less than 10 digits
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CreatePhoneNumber.createPhoneNumber(input);
        });
        assertEquals("Input array must contain exactly 10 digits.", exception.getMessage());
    }

    @Test
    void testLongInputThrowsException() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1}; // More than 10 digits
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CreatePhoneNumber.createPhoneNumber(input);
        });
        assertEquals("Input array must contain exactly 10 digits.", exception.getMessage());
    }
}
