package hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplesOf3or5Test {
    
    @Test
    public void testSolution() {
        assertEquals(23, MultiplesOf3or5.solution(10));  
        assertEquals(78, MultiplesOf3or5.solution(20));  
        assertEquals(0, MultiplesOf3or5.solution(0));  
        assertEquals(0, MultiplesOf3or5.solution(-5)); 
        assertEquals(143, MultiplesOf3or5.solution(25));  
    }
}
