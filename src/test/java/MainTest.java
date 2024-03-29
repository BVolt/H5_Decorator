import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.*;

public class MainTest {
    private ByteArrayOutputStream output;

    @BeforeEach
    public void build(){
        output = new ByteArrayOutputStream(); 
        System.setOut(new PrintStream(output));
    }

    @Test
    public void testMain(){
        String expected = "Items Ordered\n" +
                "--------------------------------------------------\n" +
                "Burger with Cheese with Pickles\n" +
                "Hot Dog with Chili with Cheese\n" +
                "Fries with Ketchup\n" +
                "\n" +
                "--------------------------------------------------\n" +
                "Subtotal\n" +
                "--------------------------------------------------\n" +
                "10.8\n" +
                "--------------------------------------------------\n" +
                "Final Total\n" +
                "--------------------------------------------------\n" +
                "9.72\n";
        expected = expected.trim();
        Main.main(new String[0]);
        String actual = output.toString().trim().replace("\r\n", "\n");

        assertEquals(expected, actual);
    }
}
