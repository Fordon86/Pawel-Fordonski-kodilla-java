package com.kodilla.stream;

import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Forum;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theUserList = new Forum();

        Map<Integer, ForumUser> theResultMapOfForumUser = theUserList.getTheUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().getYear() < 2000)
                .filter(forumUser -> forumUser.getNumberOfPost() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserIp, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForumUser.size());
        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}