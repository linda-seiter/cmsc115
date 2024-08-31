import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.github.stefanbirkner.systemlambda.SystemLambda.*;

class MainTest {

    @Test
    void mainIOTest() throws Exception {
        String input = "Fred";
        String expectedOutput = "Enter name: " +
                "Hello Fred\n";

        // Capture the output from Main.main using the provided input.
        withTextFromSystemIn(input).execute(() -> {
            String actualOutput = tapSystemOutNormalized(() -> {
                Main.main(new String[] {});
            });
            // Compare expected vs actual output
            assertEquals(expectedOutput, actualOutput);
        });
    }
}