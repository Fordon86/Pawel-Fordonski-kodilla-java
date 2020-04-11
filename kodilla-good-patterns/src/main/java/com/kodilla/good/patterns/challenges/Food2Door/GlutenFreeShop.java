package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GlutenFreeShop implements Shop {

    private ShopInformation shopInfo;
    private Map<Product, Integer> products = new HashMap<>();

    @Override
    public ShopInformation getShopInfo() {
        return shopInfo;
    }

    @Override
    public Set<Product> getProducts() {
        return products.keySet();
    }

    @Override
    public void process(Product product, Integer quantity) {
        if (products.get(product)<quantity){
            System.out.println("There is not enough product in the GlutenFreeShop.");
            return;
        } else {
            System.out.println("Order from GlutenFreeShop completed.");
            products.put(product,products.get(product) - quantity);
        }
    }

    public GlutenFreeShop (){
        this.shopInfo = new ShopInformation("HealthyShop", "Food from the greenhouse");
        products.put(new Product("Schab"), 200);
        products.put(new Product("Golonka"), 150);
        products.put(new Product("Karczek"), 100);
    }

}

