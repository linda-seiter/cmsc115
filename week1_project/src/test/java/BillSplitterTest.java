import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import static com.github.stefanbirkner.systemlambda.SystemLambda.*;

class BillSplitterTest {

    @Test
    void main() {
        assertTrue(true);
    }

    @Test
    @DisplayName("BillSplitter.main prints correct output")
    void mainOutputTest() throws Exception {
        String expectedOutput = "56.52\n";
        // Capture the output from BillSplitter.main
        String actualOutput = tapSystemOutNormalized(() -> {
            BillSplitter.main(new String[] {});
        });
        // Compare expected vs actual output
        assertEquals(expectedOutput, actualOutput);
    }
}