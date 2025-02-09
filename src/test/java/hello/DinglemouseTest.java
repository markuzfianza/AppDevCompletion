import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DinglemouseTest {

    @Test
    void testSingleDigitNumbers() {
        assertEquals("One", Dinglemouse.getNumberName(1));
        assertEquals("Two", Dinglemouse.getNumberName(2));
        assertEquals("Three", Dinglemouse.getNumberName(3));
        assertEquals("Zero", Dinglemouse.getNumberName(0));
    }

    @Test
    void testUnknownNumber() {
        assertEquals("Unknown", Dinglemouse.getNumberName(10));
        assertEquals("Unknown", Dinglemouse.getNumberName(-1));
    }
}
