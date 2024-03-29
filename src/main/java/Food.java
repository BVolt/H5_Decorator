import java.util.Objects;

public class Food implements Purchasable {
    private final String foodName;
    private final double price;

    public Food(String foodName, double price) {
        this.foodName = foodName;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.foodName;
    }


    //Two overridden function used for unit testing Order
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Double.compare(price, food.price) == 0 && Objects.equals(foodName, food.foodName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodName, price);
    }
}
