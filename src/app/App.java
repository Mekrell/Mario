
package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rasmus
 */
public final class App {

    private static List<Pizza> pizzas = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    
    private static String makeOrder;
    private static String pickOptions;
    public static void main(String[] args) {
        
        createDefaultPizzas();
        OrderList orderLists = new OrderList();
        while (true) {
            System.out.println("1 - Create order\n2 - Menu\n3 - Move order");  
            pickOptions = input.next();
            System.out.println("Your current orders are: ");
            System.out.println(orderLists.orderListCurrent);
            if("1".equals(pickOptions)) {
                while (true) {
                    System.out.println("Would you like to make a new order? Y/N: ");
                    makeOrder = input.next();
                        if("Y".equals(makeOrder)) {
                            Order customerOrder = createOrder();
                            System.out.println("Your order is: " + customerOrder.order + "\nThe total price is: " + customerOrder.getOrderTotal() + "\nPickup time: " + customerOrder.getTimeOfPickup());
                            orderLists.addOrder(customerOrder);
                            System.out.println("Your current orders are: ");
                            System.out.println(orderLists.orderListCurrent);
                        }
                        else if("N".equals(makeOrder)) {
                            System.out.println("Going back");
                            break;
            
                        }
                }
            }
            else if("2".equals(pickOptions)) {
                System.out.println(pizzas);
            }
            else if("3".equals(pickOptions)) {
                while (true) {
                    System.out.println("Would you like to move an order? Y/N: ");
                    pickOptions = input.next();
                    if("Y".equals(pickOptions)) {
                        OrderList lists = moveBetweenLists(orderLists);
                        System.out.println("Your current orders are: ");
                        System.out.println(lists.orderListCurrent);
                    }
                    else if("N".equals(pickOptions)) {
                        System.out.println("Going back");
                        break;
                    }
                }
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
        
        order.timeOfPickup = input.nextDouble();
        order.id = order.id;
        return order;
    }
    
    public static OrderList moveBetweenLists(OrderList orderLists) {
        
        
        int id = 0;
        
        while (true) {
            System.out.print("Which order would you like to move(-1 to quit)?: ");
            System.out.println(orderLists.getOrderListCurrent());
            id = input.nextInt();
            if (-1 == id) {
                break;
            }

//            Order order = findOrder(id, orderLists.orderListCurrent);
            String message = "no order found";
            for(Order order : orderLists.orderListCurrent) {
                if(order.getId() == id) {
                    orderLists.removeOrder(order);
                    
                    message = ("Your order has been moved");
                    
                    break;
                }
            }
            System.out.println(message);
            System.out.println("Total earnings: " + orderLists.getOrderListOldTotal());
            
            
        }
        
        
        return orderLists;
    }
    
    public static Order findOrder(int id, OrderList orderLists) {
    
        for (Order order : moveBetweenLists(orderLists).orderListCurrent) {
            if (order.getId() == id) {
                return order;
            }
        }

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
