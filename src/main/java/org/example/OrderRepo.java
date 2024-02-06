package org.example;

public interface OrderRepo {
    Order add(Order newOrder);
    void remove(String id);

}
