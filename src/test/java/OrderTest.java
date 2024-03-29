import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    private Order order;

    @BeforeEach
    public void build(){
        this.order = new Order();
    }

    @Test
    public void testAddItem(){
        order.addItem(new Food("Burger", 2.00));
        List<Purchasable> expected = new ArrayList<>();
        expected.add(new Food("Burger", 2.00));
        List<Purchasable> actual = order.getItems();
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testGetOrderTotal(){
        order.addItem(new Food("Burger", 4.00));
        order.addItem(new Food("Fries", 2.00));
        double expected = 6.00;
        double actual = order.getOrderTotal();
        assertEquals(expected, actual);
    }

    @Test
    public void testListOrderItems(){
        order.addItem(new Food("Burger", 4.00));
        order.addItem(new Food("Fries", 2.00));
        String expected = "Burger\nFries\n";
        String actual = order.listOrderItems();
        assertEquals(expected, actual);
    }
}
