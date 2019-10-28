
package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rasmus
 */
public final class App {
/*TODO make method that can find specific order based on id generated so said order can be moved to and from orderlists
make while loops in main to make a sort of program menu so you can switch between making an order or moving orders and so on
(maybe remake OrderList class to be a more simple object with two ArrayLists and a simple add and move method)
*/
    private static List<Pizza> pizzas = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    
    private static String makeOrder;

    public static void main(String[] args) {
        
        createDefaultPizzas();
        while (true) {
        System.out.println("Would you like to make a new order? Y/N: ");
        makeOrder = input.next();
        if("Y".equals(makeOrder)) {
        Order customerOrder = createOrder();
        
        
        System.out.println("Your order is: " + customerOrder.order + "\nThe total price is: " + customerOrder.getOrderTotal() + "\nPickup time: " + customerOrder.getTimeOfPickup());
        
        }
        else if("N".equals(makeOrder)) {
            System.out.println();
            break;
            
        }
        
        }
        

    }

    public static void createDefaultPizzas() {
        pizzas.add(new Pizza(1, "Vesuvio", 57));
        pizzas.add(new Pizza(2, "Amerikaner", 53));
        pizzas.add(new Pizza(3, "Cacciatore", 57));
        pizzas.add(new Pizza(4, "Carbona", 63));
        pizzas.add(new Pizza(5, "Dennis", 65));
        pizzas.add(new Pizza(6, "Bertil", 57));
        pizzas.add(new Pizza(7, "Silvia", 61));
        pizzas.add(new Pizza(8, "Victoria", 61));
        pizzas.add(new Pizza(9, "Toronfo", 61));
        pizzas.add(new Pizza(10, "Capricciosa", 61));
        pizzas.add(new Pizza(11, "Hawai", 61));
        pizzas.add(new Pizza(12, "Le Blissola", 61));
        pizzas.add(new Pizza(13, "Venezia", 61));
        pizzas.add(new Pizza(14, "Mafia", 61));
    }
    
    public static Order createOrder() {
        Order order = new Order();
        int menuNumber;

        while (true) {
            System.out.print("What menu number would you like to order(-1 to end order)?: ");
            menuNumber = input.nextInt();
            if (menuNumber == -1) {
                break;
            }

            Pizza pizza = findPizza(menuNumber);

            if (pizza == null) {
                System.out.println("Invalid menu number, try again");
            } else {
                order.addPizza(pizza);
            }
            
        }
        System.out.print("Pickup time: ");
        
        Order.timeOfPickup = input.nextDouble();
        Order.id = Order.id + 1;
        return order;
    }
    public static OrderList createLists() {
        OrderList orderLists = new OrderList();
        String currentOrOld;
        int id = 0;
        
        while (true) {
            System.out.print("Which order would you like to move(-1 to quit)?: ");
            currentOrOld = input.next();
            if ("-1".equals(currentOrOld)) {
                break;
            }

            Order order = findOrder(id);

            if (order == null) {
                System.out.println("Invalid menu number, try again");
            } else {
                orderLists.addOrder(order);
            }
            
        }
        System.out.print("Pickup time: ");
        
        Order.timeOfPickup = input.nextDouble();
        
        
        return orderLists;
    }
    
    public static Order findOrder(int id) {
    /*
        for (Order order : ) {
            if (order.getId() == id) {
                return order;
            }
        }
*/
        return null;
    }


    public static Pizza findPizza(int menuNumber) {

        for (Pizza pizza : pizzas) {
            if (pizza.getMenuNumber() == menuNumber) {
                return pizza;
            }
        }
        return null;
    }
}
