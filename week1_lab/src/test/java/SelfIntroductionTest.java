import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import static com.github.stefanbirkner.systemlambda.SystemLambda.*;

class SelfIntroductionTest {

    @Test
    @DisplayName("SelfIntroduction.main prints correct output")
    void mainOutputTest() throws Exception {
        // Capture the output from SelfIntroduction.main
        String actualOutput = tapSystemOutNormalized(() -> {
            SelfIntroduction.main(new String[] {});
        });
        // Split output on newline character
        String[] lines = actualOutput.split("\n");
        // Confirm at least 4 lines of output
        assertTrue(lines.length >= 4, "At least 4 lines of output");
    }

}