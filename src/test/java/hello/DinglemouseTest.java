import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DinglemouseTest {

    @Test
    void testOneYear() {
        assertArrayEquals(new int[]{1, 15, 15}, Dinglemouse.humanYearsCatYearsDogYears(1));
    }

    @Test
    void testTwoYears() {
        assertArrayEquals(new int[]{2, 24, 24}, Dinglemouse.humanYearsCatYearsDogYears(2));
    }

    @Test
    void testTenYears() {
        assertArrayEquals(new int[]{10, 56, 64}, Dinglemouse.humanYearsCatYearsDogYears(10));
    public void testSingleDigitNumbers() {
        assertEquals("One", Dinglemouse.getNumberName(1));
        assertEquals("Two", Dinglemouse.getNumberName(2));
        assertEquals("Three", Dinglemouse.getNumberName(3));
        assertEquals("Zero", Dinglemouse.getNumberName(0));
    }

    @Test
    public void testUnknownNumber() {
        assertEquals("Unknown", Dinglemouse.getNumberName(10));
        assertEquals("Unknown", Dinglemouse.getNumberName(-1));
    }
}
