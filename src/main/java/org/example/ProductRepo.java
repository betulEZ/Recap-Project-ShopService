package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private List<Product> products;
    public ProductRepo(List<Product> product) {
        this.products = product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    void add(List<Product> newProduct){
        products.addAll(newProduct);
    }
    void remove(Product p){
        products.remove(p);
    }
    void getAllProduct(){
        for(Product p: products) {
            System.out.println(p.name()+" "+p.id());
        }
    }

}
