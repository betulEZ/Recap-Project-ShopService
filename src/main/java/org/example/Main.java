package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Product> list=new ArrayList<>();
        Product product =new Product("product1","1");
        Product product2 =new Product("product2","3");

        list.add(product);
        list.add(product2);

        ProductRepo productRepo=new ProductRepo(list);
        productRepo.getAllProduct();

        List<Order> orderList=new ArrayList<>();

        Order order=new Order(product,"1");
        orderList.add(order);

        OrderListRepo orderListRepo=new OrderListRepo(orderList);

        ShopService shopService=new ShopService(productRepo,orderListRepo);

        shopService.newOrder(order);

        OrderMapRepo orderMapRepo=new OrderMapRepo();
        ShopService shopService2=new ShopService(orderMapRepo,orderListRepo);
        //System.out.println(shopService2);


    }
}