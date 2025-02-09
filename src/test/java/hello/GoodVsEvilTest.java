package hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GoodVsEvilTest {

    @Test
    void testGoodWins() {
        String good = "1 1 1 1 1 1";  
        String evil = "0 0 0 0 0 0 0";  
        assertEquals("Battle Result: Good triumphs over Evil", GoodVsEvil.determineBattleOutcome(good, evil));
    }

    @Test
    void testEvilWins() {
        String good = "0 0 0 0 0 0";  
        String evil = "1 1 1 1 1 1 1";  
        assertEquals("Battle Result: Evil eradicates all trace of Good", GoodVsEvil.determineBattleOutcome(good, evil));
    }

    @Test
    void testDraw() {
        String good = "1 2 3 4 5 6";  
        String evil = "1 2 3 4 5 6 0";  
        assertEquals("Battle Result: No victor on this battle field", GoodVsEvil.determineBattleOutcome(good, evil));
    }

    @Test
    void testInvalidInputLength() {
        String good = "1 2 3";  
        String evil = "1 2 3 4 5 6 7";
        assertEquals("Invalid input: Please ensure proper formatting.", GoodVsEvil.determineBattleOutcome(good, evil));
    }

    @Test
    void testInvalidNonNumericInput() {
        String good = "a b c d e f"; 
        String evil = "1 2 3 4 5 6 7";
        assertEquals("Invalid input: Please ensure proper formatting.", GoodVsEvil.determineBattleOutcome(good, evil));
    }
}
