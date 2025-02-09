import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreatePhoneNumberTest {

    @Test
    public void testValidPhoneNumber() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String expected = "(123) 456-7890";
        assertEquals(expected, CreatePhoneNumber.createPhoneNumber(numbers));
    }

    @Test
    public void testAnotherValidPhoneNumber() {
        int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        String expected = "(987) 654-3210";
        assertEquals(expected, CreatePhoneNumber.createPhoneNumber(numbers));
    }

    @Test
    public void testInvalidLength() {
        int[] shortArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] longArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1};

        assertThrows(IllegalArgumentException.class, () -> CreatePhoneNumber.createPhoneNumber(shortArray));
        assertThrows(IllegalArgumentException.class, () -> CreatePhoneNumber.createPhoneNumber(longArray));
    }

    @Test
    public void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> CreatePhoneNumber.createPhoneNumber(null));
    }
}
