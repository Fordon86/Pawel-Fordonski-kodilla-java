package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.repositories.Product;
import com.kodilla.good.patterns.challenges.repositories.ProductOrder;
import com.kodilla.good.patterns.challenges.repositories.User;

public class ProductOrderService {

    public static void main(String[] args){

        User user = new User("Jon", "Jon@o2.pl");
        Product product = new Product("mouses", 15);
        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor();

        UserInformer userInformer = new UserInformer();

        ProductOrder productOrder = productOrderProcessor.process(user, product, 5);
        userInformer.informUser(productOrder);
    }

}
