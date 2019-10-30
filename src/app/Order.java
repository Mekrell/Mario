/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rasmus
 */
public class Order {
    List<Pizza> order;
    public double timeOfPickup;
    public int id;

    public Order() {
        order = new ArrayList<>();
        id = idFactory.getOrderId();
    }

    public double getTimeOfPickup() {
        return timeOfPickup;
    }

    public int getId() {
        return id;
    }

    public List<Pizza> getOrder() {
        return order;
    }

    public void addPizza(Pizza pizza) {
        order.add(pizza);
    }
    public double getOrderTotal() {
        double sum=0;
        for(Pizza pizza: order){
            sum=sum + pizza.price;
        }
            
        return sum;
    }

    @Override
    public String toString() {
        return "\nOrder: " + order + "\n Time of pickup: " + timeOfPickup + "\n Id: " + id;
    }
    
}
