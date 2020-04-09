package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.repositories.Product;
import com.kodilla.good.patterns.challenges.repositories.ProductOrder;
import com.kodilla.good.patterns.challenges.repositories.User;
import com.kodilla.good.patterns.challenges.repositories.ProductOrderRepository;

public class ProductOrderProcessor {

    private ProductOrderRepository productOrderRepository = new ProductOrderRepository();

    public ProductOrder process (final User user, final Product product, int quantity) {
        return productOrderRepository.createProductOrder(user, product, quantity);
    }

}
