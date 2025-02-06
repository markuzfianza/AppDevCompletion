package hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class sumOfSequenceTest {

    @Test
    public void testSequenceSum() {

        assertEquals(15, sumOfSequence.sequenceSum(1, 5, 1));  
        assertEquals(5, sumOfSequence.sequenceSum(1, 5, 4)); 
        assertEquals(0, sumOfSequence.sequenceSum(10, 5, 1)); 
        assertEquals(13, sumOfSequence.sequenceSum(2, 10, 3));  
        assertEquals(0, sumOfSequence.sequenceSum(1, 0, 2)); 
        assertEquals(7, sumOfSequence.sequenceSum(7, 7, 1));  
    }
}
