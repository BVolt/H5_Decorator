public class Main {

    public static void main(String[] args) {
        //Create some food items
        Food burger = new Food("Burger", 4.00);
        Food fries = new Food("Fries", 2.00);
        Food hotDog = new Food("Hot Dog", 3.00);

        //Add some toppings (Decorator pattern)
        FoodWithToppings cheeseBurger = new FoodWithToppings(burger,"Cheese", .50);
        FoodWithToppings pickleCheeseBurger = new FoodWithToppings(cheeseBurger, "Pickles", .25);
        FoodWithToppings hotDogChili = new FoodWithToppings(hotDog, "Chili", .25);
        FoodWithToppings hotDogChiliCheese = new FoodWithToppings(hotDogChili, "Cheese", .50);
        FoodWithToppings ketchupFries = new FoodWithToppings(fries, "Ketchup", .30);

        //Create an order
        Order order = new Order();
        order.addItem(pickleCheeseBurger);
        order.addItem(hotDogChiliCheese);
        order.addItem(ketchupFries);

        //Apply loyalty discount
        CustomerLoyalty casualCustomer = new CustomerLoyalty("Casual");
        double finalPrice = casualCustomer.applyDiscount(order);

        //Print Order contents and subtotal cost
        System.out.println("Items Ordered");
        divider();
        System.out.println(order.listOrderItems());
        divider();
        System.out.println("Subtotal");
        divider();
        System.out.println(order.getOrderTotal());

        //Print Final Total Cost
        divider();
        System.out.println("Final Total");
        divider();
        System.out.println(finalPrice);
    }

    public static void divider(){
        System.out.println(new String(new char[50]).replace("\0", "-"));
    }
}
