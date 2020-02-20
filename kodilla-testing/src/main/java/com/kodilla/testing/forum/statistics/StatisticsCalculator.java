package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    private int postsCount;
    private int commentsCount;
    private int usersCount;
    private double averagePostPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistic (Statistics statistics){

        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        usersCount = statistics.usersNames().size();
        averageCommentsPerPost = commentsCount / postsCount;
        averageCommentsPerUser = commentsCount / usersCount;
        averagePostPerUser = postsCount/usersCount;
    }
    public int getPostsCount() {
        return postsCount;
    }
    public int getCommentsCount(){
        return commentsCount;
    }
    public int getUsersCount(){
        return usersCount;
    }
    public double getAverageCommentsPerPost(){
        return averageCommentsPerPost;
    }
    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }
}
