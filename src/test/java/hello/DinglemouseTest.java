package hello;

import hello.Dinglemouse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DinglemouseTest {

    @Test
    void testOneYear() {
        assertArrayEquals(new int[]{1, 15, 15}, Dinglemouse.convertHumanToAnimalYears(1));
    }

    @Test
    void testTwoYears() {
        assertArrayEquals(new int[]{2, 24, 24}, Dinglemouse.convertHumanToAnimalYears(2));
    }

    @Test
    void testTenYears() {
        assertArrayEquals(new int[]{10, 56, 64}, Dinglemouse.convertHumanToAnimalYears(10));
    }
}
