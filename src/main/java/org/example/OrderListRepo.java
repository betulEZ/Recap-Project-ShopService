package org.example;

import java.util.List;

public class OrderListRepo implements OrderRepo {
    private List<Order> orders;

    public OrderListRepo(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void add(Order newOrder){
        orders.add(newOrder);
    }
    public void remove(Order o){
        orders.remove(o);
    }
    public void getProduct(){
        for(Order o: orders) {
            System.out.println(o.products()+" "+o.id());
        }
    }
}
