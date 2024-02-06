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

    public Order add(Order newOrder){
        orders.add(newOrder);
        return  newOrder;
    }

    public void remove(String id){
        for(Order p: orders) {
            if (p.id().equals(id)) {
                orders.remove(p);
                return; //um diese Methode zu beenden
            }
        }

    }
    public void getAllProduct(){
        for(Order o: orders) {
            System.out.println(o.products()+" "+o.id());
        }
    }
}
