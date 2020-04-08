package com.kodilla.good.patterns.challenges;

public class User {

    private String userName;
    private String userEmail;

    private void userInfo (String userName, String userEmail){
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
