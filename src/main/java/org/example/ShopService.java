package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
    private ProductRepo productRepo;
    private OrderListRepo orderListRepos;

    @Override
    public String toString() {
        return "ShopService{" +
                "productRepo=" + productRepo +
                ", orderListRepos=" + orderListRepos +
                ", orderMapRepo=" + orderMapRepo +
                '}';
    }

    private OrderMapRepo orderMapRepo;

    public ShopService(ProductRepo productRepo, OrderListRepo orderListRepos) {
        this.productRepo = productRepo;
        this.orderListRepos = orderListRepos;
    }
    public ShopService(OrderMapRepo orderMapRepo, OrderListRepo orderListRepos) {
        this.orderMapRepo = orderMapRepo;
        this.orderListRepos = orderListRepos;
    }

    void newOrder(Order ordnerNew){
            for (Product p: productRepo.getProducts()) {
                if (ordnerNew.id().equals(p.id())) {
                    System.out.println(p.id()+" find");
                    break;
                } else {
                    System.out.println(p.id()+" not find");
                }
            }

    }
}
