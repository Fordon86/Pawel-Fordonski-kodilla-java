package com.kodilla.stream.forumuser;

import java.time.*;


public final class ForumUser {
    private final int userIp;
    private final String userName;
    private final char sex;
    private final  LocalDate birthDate;
    private final int numberOfPost;


    public ForumUser (final int userIp, final String userName, final char sex, final LocalDate birthDate, final int numberOfPost){
        this.userIp = userIp;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.numberOfPost = numberOfPost;
    }

    public int getUserIp() {
        return userIp;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        if (userIp != forumUser.userIp) return false;
        if (sex != forumUser.sex) return false;
        if (numberOfPost != forumUser.numberOfPost) return false;
        if (userName != null ? !userName.equals(forumUser.userName) : forumUser.userName != null) return false;
        return birthDate != null ? birthDate.equals(forumUser.birthDate) : forumUser.birthDate == null;
    }

    @Override
    public int hashCode() {
        int result = userIp;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (int) sex;
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + numberOfPost;
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userIp=" + userIp +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPost=" + numberOfPost +
                '}';
    }
}
