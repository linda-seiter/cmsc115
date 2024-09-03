import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentInfoTest {

    @Test
    @DisplayName("StudentInfo.main prints correct output")
    public void mainIOTest() {
    	String expectedOutput = "Age: 28 gpa: 3.8\n"
    			+ "Age: 29 gpa: 4.0";
        String actualOutput = JunitHelper.mainOutput("StudentInfo");
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    @DisplayName("StudentInfo.main declares gpa once")
    public void gpaTest() {
    	String pattern = "double\s+gpa";
    	int expectedCount = 1;
    	int actualCount = JunitHelper.countOccurrences("StudentInfo", "main", pattern);
    	assertEquals(expectedCount, actualCount);
    }
    

}

