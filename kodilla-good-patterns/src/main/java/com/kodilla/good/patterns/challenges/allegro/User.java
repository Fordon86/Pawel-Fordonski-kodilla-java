package com.kodilla.good.patterns.challenges.repositories;

public class User {

    private String userName;
    private String userEmail;

    public User (String userName, String userEmail){
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
