import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static com.github.stefanbirkner.systemlambda.SystemLambda.*;

class PoemTest {

    @Test
    @DisplayName("PoemTest.main prints at least 10 lines of output")
    void mainOutputTest() throws Exception {

        // Capture the output from Poem.main
        String actualOutput = tapSystemOutNormalized(() -> {
            Poem.main(new String[] {});
        });

        // Split output on newline character
        String[] lines = actualOutput.split("\n");

        // Confirm at least 10 lines of output
        assertTrue(lines.length >= 10, "At least 10 lines of output");
    }
}