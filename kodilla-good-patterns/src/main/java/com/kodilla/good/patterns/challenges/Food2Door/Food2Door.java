package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Random;
import java.util.Set;

public class Food2Door {

    private static ExtraFoodShop extraFoodShop = new ExtraFoodShop();
    private static HealthyShop healthyShop = new HealthyShop();
    private static GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

    private static Product randomProduct(Set<Product> extraFoodShopProducts){
        Random random = new Random();
        int rand = random.nextInt(extraFoodShopProducts.size());
        int i =0;
        for (Product product: extraFoodShopProducts ){
            if (i == rand){
                return product;
            }
            i++;
        }
        return null;
    }

    public static void main(String[] args){
        Set<Product> extraFoodShopProducts = extraFoodShop.getProducts();
        extraFoodShop.process(randomProduct(extraFoodShopProducts),160);

        Set<Product>healthyShopProducts = healthyShop.getProducts();
        healthyShop.process(randomProduct(healthyShopProducts),50);

        Set<Product> glutenFreeShopProducts = glutenFreeShop.getProducts();
        glutenFreeShop.process(randomProduct(glutenFreeShopProducts),80);

    }



}
