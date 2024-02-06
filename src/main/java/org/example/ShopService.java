package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    public Order find(String id){
            for (Product p: productRepo.getProducts()) {
                if (p.id().equals(id)) {
                    System.out.println(id+" find");
                    break;
                } else {
                    continue;
                }
            }
        return null;
    }

}
