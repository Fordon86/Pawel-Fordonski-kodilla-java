package com.kodilla.good.patterns.challenges.Allegro;

public class ProductOrderRepository {

    public ProductOrder createProductOrder (final User user, final Product product, int quantity){
        return new ProductOrder(user, product, quantity);
    }

}
