package org.example;

import java.util.Map;

public class OrderMapRepo implements OrderRepo{
    private Map<String, Order> orderMap;
    @Override
    public void add(Order newOrder) {
     orderMap.put(newOrder.id(),newOrder);
    }

    @Override
    public void remove(Order o) {
     orderMap.remove(o.id(),o);
    }



}
