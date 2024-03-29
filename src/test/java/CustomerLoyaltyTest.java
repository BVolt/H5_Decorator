import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerLoyaltyTest {
    CustomerLoyalty customer1, customer2, customer3, customer4;
    Order order;

    @BeforeEach
    public void build(){
        order = new Order();
        order.addItem(new Food("Pie", 2.00));
        customer1 = new CustomerLoyalty("Casual");
        customer2 = new CustomerLoyalty("Regular");
        customer3 = new CustomerLoyalty("Devoted");
        customer4 = new CustomerLoyalty("New");
    }

    @Test
    public void testApplyDiscountCasual(){
        double expected = 1.80;
        double actual = customer1.applyDiscount(order);
        assertEquals(expected, actual);
    }

    @Test
    public void testApplyDiscountRegular(){
        double expected = 1.50;
        double actual = customer2.applyDiscount(order);
        assertEquals(expected, actual);
    }

    @Test
    public void testApplyDiscountDevoted(){
        double expected = 1.00;
        double actual = customer3.applyDiscount(order);
        assertEquals(expected, actual);
    }

    @Test
    public void testApplyDiscountNone(){
        double expected = 2.00;
        double actual = customer4.applyDiscount(order);
        assertEquals(expected, actual);
    }
}
