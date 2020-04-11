package com.kodilla.good.patterns.challenges.Allegro;

public class UserInformer {

    public void informUser(ProductOrder productOrder){
        Product product = productOrder.getProduct();
        System.out.println(String.format("User %s ordered %d of %s in total price of %d$. Yours order number is %d",productOrder.getUser().getUserName(),
                productOrder.getQuantity(), product.getProductName(),product.getProductPrice()*productOrder.getQuantity(), productOrder.getOrderNumber() ) );
    }

}
