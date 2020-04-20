package com.kodilla.patterns.strategy.social;

public class User {
    private String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String defaultSharePost (){
        return socialPublisher.share();
    }

    public void setIndividualSharePost (SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }

}
