public class FoodWithToppings implements Purchasable {
    private final Purchasable food;
    private final String toppingName;
    private final double toppingPrice;

    public FoodWithToppings(Purchasable food, String toppingName, double toppingPrice) {
        this.food = food;
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
    }

    public double getPrice() {
        return food.getPrice() + this.toppingPrice;
    }

    public String getDescription() {
        return food.getDescription() + " with " + this.toppingName;
    }
}
