package com.kodilla.good.patterns.challenges.Allegro;

public class ProductOrderProcessor {

    private ProductOrderRepository productOrderRepository = new ProductOrderRepository();

    public ProductOrder process (final User user, final Product product, int quantity) {
        return productOrderRepository.createProductOrder(user, product, quantity);
    }

}
