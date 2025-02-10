package hello;

import hello.DoubleLinear;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DoubleLinearTest {

    @Test
    void testDblLinear() {
        assertEquals(1, DoubleLinear.dblLinear(0));
        assertEquals(3, DoubleLinear.dblLinear(1));
        assertEquals(4, DoubleLinear.dblLinear(2));
        assertEquals(7, DoubleLinear.dblLinear(3));
        assertEquals(9, DoubleLinear.dblLinear(4));
        assertEquals(22, DoubleLinear.dblLinear(10));
        assertEquals(57, DoubleLinear.dblLinear(20));
        assertEquals(79, DoubleLinear.dblLinear(25));
    }
}
