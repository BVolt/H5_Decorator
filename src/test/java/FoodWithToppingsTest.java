import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodWithToppingsTest {
    private FoodWithToppings toppedFood;

    @BeforeEach
    public void build(){
        Food hotDog = new Food("Hot Dog", 2.00);
        FoodWithToppings hotDogChili = new FoodWithToppings(hotDog, "chili", .25);
        this.toppedFood = new FoodWithToppings(hotDogChili, "cheese", .50);
    }

    @Test
    public void testGetPrice(){
        double expected = 2.75;
        double actual = toppedFood.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetDescription(){
        String expected = "Hot Dog with chili with cheese";
        String actual = toppedFood.getDescription();
        assertEquals(expected, actual);
    }
}
