package com.kodilla.good.patterns.challenges;

public class SellProcessor {

    private UserInfo userInfo;
    private ProductOrder productOrder;
    private SellImplementation sellImplementation;
    private SellRepository sellRepository;

    public static SellProcessor sellRequest() {

//        userInfo = new UserInfo("Tom", "Tom@o2");
//        productOrder = new ProductOrder("Ball", 20.5, 3);
        return new SellProcessor();
    }

    public void sellIsDone (){

        sellImplementation = new SellImplementation();
        boolean isSellImplementation = sellImplementation.sellImplementation(sellRequest().userInfo);

        if (isSellImplementation == true) {
            System.out.println("Transaction is done");
        } else
            System.out.println("Complete user data");
        return sellIsDone();
    }

}
