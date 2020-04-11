package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Set;

public interface Shop {
     ShopInformation getShopInfo();
     Set<Product> getProducts();
     void process(Product product, Integer quantity);

}
