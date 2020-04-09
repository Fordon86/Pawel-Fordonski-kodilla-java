package com.kodilla.good.patterns.challenges.repositories;

import java.util.Random;

public class ProductOrder {

    private User user;
    private Product product;
    private int quantity;
    private int orderNumber;

    public ProductOrder(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;

        Random random = new Random();
        orderNumber = random.nextInt( 1000);
        this.orderNumber=orderNumber;

    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}


