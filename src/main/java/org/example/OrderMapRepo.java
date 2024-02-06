package org.example;

import java.util.Map;

public class OrderMapRepo implements OrderRepo{
    private Map<String, Order> orderMap;
    @Override
    public Order add(Order newOrder) {
     orderMap.put(newOrder.id(),newOrder);
     return newOrder;
    }

    @Override
    public void remove(String id) {
        for (Order o:orderMap.values()){
            if (o.id().equals(id)){
                orderMap.remove(id,o);
            }
        }
    }



}
