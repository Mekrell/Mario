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
public class OrderList {
    public List<Order> orderListCurrent;
    public List<Order> orderListOld;
    

    public OrderList() {
        orderListCurrent = new ArrayList<>();
        orderListOld = new ArrayList<>();
        
    }

    public List<Order> getOrderListCurrent() {
        return orderListCurrent;
    }
    public List<Order> getOrderListOld() {
        return orderListOld;
    }

    
    public void addOrder(Order order) {
        orderListCurrent.add(order);
    }
    public void removeOrder(Order order) {
        orderListCurrent.remove(order);
        orderListOld.add(order);
    }
    public double getOrderListCurrentTotal() {
        double sum=0;
        for(Order order: orderListCurrent){
            sum=sum + order.getOrderTotal();
        }
            
        return sum;
    }
}

