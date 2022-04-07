import java.util.ArrayList;
import java.util.Arrays;

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
        order1.ready = true;
        

        // Add item1 to order2's item list and increment the order's total.
        Order order2 = new Order();
        order2.name ="Jimmy";

        Order order3 = new Order();
        order3.name ="Noah";

        Order order4 = new Order();
        order4.name ="Sam";

        // Application 
        order2.items.add(item1);
        order2.total += item1.price;
        System.out.println("Order2 is: "+ order2.items + "/n Total: " + order2.total);
        // Use this example code to test various orders' updates

        // order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item4);
        order3.total+= item4.price;
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        //
        //Cindhuri’s order is now ready. Update her status.
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Ready: %s\n", order1.ready);
        //
        //order4 added a latte. Update accordingly.
        order4.items.add(item4);
        order4.total += item4.price;
        System.out.printf("Order 4 :");
        System.out.printf("Name: %s\n", order4.name);
        
           // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        //
        // System.out.printf("Ready: %s\n", order1.ready);


// Sam ordered more drinks - 2 lattes. Update their order as well.

// Jimmy’s order is now ready. Update his status.


    }
}
