package com.kodilla.good.patterns.challenges;

public class Product {

    private String productName;
    private double productPrice;

    private void productOrder(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

}
