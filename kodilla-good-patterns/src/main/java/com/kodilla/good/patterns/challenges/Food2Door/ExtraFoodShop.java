package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExtraFoodShop implements Shop {

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
        if (products.get(product)==null){
            System.out.println("There is no product in the ExtraFoodShop.");
            return;
        } else if (products.get(product)<quantity){
            System.out.println("There is not enough product in the ExtraFoodShop.");
            return;
        } else {
            System.out.println("Order from ExtraFoodShop completed.");
            products.put(product,products.get(product) - quantity);
        }
    }

    public ExtraFoodShop() {
        this.shopInfo = new ShopInformation("ExtraFoodShop","Food from the orchard");
        products.put(new Product("Red Apple"),150);
        products.put(new Product("Orange"),210);
        products.put(new Product("Green Apple"),60);

    }


}
