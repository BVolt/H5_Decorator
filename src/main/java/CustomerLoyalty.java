public class CustomerLoyalty {
    private final String loyaltyStatus;

    public CustomerLoyalty(String loyalty) {
        this.loyaltyStatus = loyalty;
    }

    public double applyDiscount(Order order) {
        double subTotal = order.getOrderTotal();
        double discountRate = switch(loyaltyStatus){
            case "Casual" -> .10;
            case "Regular" -> .25;
            case "Devoted"-> .50;
            default -> 0;
        };
        return subTotal - (subTotal * discountRate);
    }
}
