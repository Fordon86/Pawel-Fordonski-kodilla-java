package com.kodilla.good.patterns.challenges;

public class SellRequest {

    private UserInfo userInfo;
    private ProductOrder productOrder;

    private SellRequest (final UserInfo userInfo, ProductOrder productOrder) {
        this.userInfo = userInfo;
        this.productOrder = productOrder;
    }

    public static SellRequest sellRequest(UserInfo userInfo, ProductOrder productOrder) {

        userInfo = new UserInfo("Tom", "Tom@o2");
        productOrder = new ProductOrder("Ball", 20.5, 3);

        return new SellRequest(userInfo, productOrder);
    }


}
