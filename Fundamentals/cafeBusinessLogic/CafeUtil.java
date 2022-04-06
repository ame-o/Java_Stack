import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {

    public int getStreakGoal(){
        int sum = 0;
        for(int i = 0; i < 11; i++){
            sum+=i;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems){
        double sum = 0;
        for (int i =0; i < lineItems.length;i++){
            sum+= lineItems[i];
        }
        return sum;
    }

    public void displayMenu (ArrayList<String>menu){
        for(int i = 0; i < menu.size(); i++){
            System.out.println((i) + " " + menu.get(i));
        }
    }

    public void addCustomer(ArrayList<String>customers){
        System.out.println("Please enter your name");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!" + "There are " + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }
}