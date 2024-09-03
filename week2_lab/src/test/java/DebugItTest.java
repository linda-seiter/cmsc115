import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebugItTest {

    @Test
    @DisplayName("DebugIt.main prints correct output")
    public void mainIOTest() {
    	String expectedOutput = "Planes on runway = 4";
        String actualOutput = JunitHelper.mainOutput("DebugIt");
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    @DisplayName("DebugIt.main uses += once")
    public void plusEqualOperator() {
    	String pattern = "\\+=";
    	int expectedCount = 1;
    	int actualCount = JunitHelper.countOccurrences("DebugIt", "main", pattern);
    	assertEquals(expectedCount, actualCount);
    }
    
    @Test
    @DisplayName("DebugIt.main uses -= once")
    public void minusEqualOperator() {
    	String pattern = "-=";
    	int expectedCount = 1;
    	int actualCount = JunitHelper.countOccurrences("DebugIt", "main", pattern);
    	assertEquals(expectedCount, actualCount);
    }

}

