package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product =new Product("product1","1");
        Product product2 =new Product("product2","3");


        ProductRepo productRepo=new ProductRepo();
        productRepo.getAllProduct();

        List<Order> orderList=new ArrayList<>();

        Order order=new Order(product,"1");
        Order order2=new Order(product2,"1");
        orderList.add(order);

        OrderListRepo orderListRepo=new OrderListRepo(orderList);

        ShopService shopService=new ShopService(productRepo,orderListRepo);

        shopService.find("1");

        OrderMapRepo orderMapRepo=new OrderMapRepo();
        ShopService shopService2=new ShopService(orderMapRepo,orderListRepo);
        //System.out.println(shopService2);



    }
}