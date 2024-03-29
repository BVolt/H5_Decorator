import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodTest {
    private Food testFood;

    @BeforeEach
    public void build(){
        this.testFood = new Food("Chocolate", 3.00);
    }

    @Test
    public void testGetPrice(){
        double expected = 3.00;
        double actual = testFood.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetDescription(){
        String expected = "Chocolate";
        String actual = testFood.getDescription();
        assertEquals(expected, actual);
    }
}
