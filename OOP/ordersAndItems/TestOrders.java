import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name ="mocha";
        item1.price = 5;

        Item item2 = new Item();
        item2.name ="latte";
        item2.price = 4.5;

        Item item3 = new Item();
        item3.name ="drip coffee";
        item3.price = 3;

        Item item4 = new Item();
        item4.name ="cappuccino";
        item4.price = 5.5;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name ="Cindhuri";
        order1.total =
        order1.ready = true;
        

        // Add item1 to order2's item list and increment the order's total.
        Order order2 = new Order();
        order2.name ="Jimmy";
        order2.total += item1.price;

        Order order3 = new Order();
        order3.name ="Noah";

        Order order4 = new Order();
        order4.name ="Sam";

        // Application 
        order2.items.add(item1);
        System.out.println("Order2 is: "+ order2.total);
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        //
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
