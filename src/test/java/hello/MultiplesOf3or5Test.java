package hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplesOf3or5Test {
    
    @Test
    public void testSolution() {
        assertEquals(23, Solution.solution(10));  
        assertEquals(78, Solution.solution(20));  
        assertEquals(0, Solution.solution(0));  
        assertEquals(0, Solution.solution(-5)); 
        assertEquals(195, Solution.solution(25));  
    }
}
