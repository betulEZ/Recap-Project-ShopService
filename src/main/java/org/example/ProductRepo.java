package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private List<Product> products;
    public ProductRepo() {
        products=new ArrayList<>();
        products.add(new Product("product4","4"));
        products.add(new Product("product1","1"));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Product add(Product newProduct){
        products.add(newProduct);
        return newProduct;
    }
    void remove(String id){
        for(Product p: products) {
            if (p.id().equals(id)) {
                products.remove(p);
                return; //um diese Methode zu beenden
            }
        }
    }
    void getAllProduct(){
        for(Product p: products) {
            System.out.println(p.name()+" "+p.id());
        }
    }

}
