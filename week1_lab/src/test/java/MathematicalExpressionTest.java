import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import static com.github.stefanbirkner.systemlambda.SystemLambda.*;

class MathematicalExpressionTest {

    @Test
    @DisplayName("MathematicalExpression.main prints correct output")
    void mainOutputTest() throws Exception {
        String expectedOutput = "(2 + 3) * 8 = 40\n";
        //Capture the output from MathematicalExpression.main  
        String actualOutput = tapSystemOutNormalized(() -> {MathematicalExpression.main(new String[]{});});
        //Compare expected vs actual output
        assertEquals(expectedOutput, actualOutput);
    }

}