import java.util.*;

public class Order {
    private List<Purchasable> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(Purchasable item) {
        items.add(item);
    }

    public List<Purchasable> getItems()
    {
        return this.items;
    }
    public double getOrderTotal() {
        double total = 0;
        for (Purchasable item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public String listOrderItems() {
        StringBuilder orderList = new StringBuilder();
        for (Purchasable item : items) {
            orderList.append(item.getDescription());
            orderList.append('\n');
        }
        return orderList.toString();
    }
}
