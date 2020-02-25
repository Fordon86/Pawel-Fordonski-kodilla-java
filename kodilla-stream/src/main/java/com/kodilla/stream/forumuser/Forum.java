package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum(){

        theUserList.add(new ForumUser(0,"Tom", 'M',LocalDate.of(1986,02,02), 5));
        theUserList.add(new ForumUser(1,"Monica", 'F',LocalDate.of(2005, 05, 06), 20));
        theUserList.add(new ForumUser(2,"Jerry", 'M', LocalDate.of(1980,01,19), 0));
        theUserList.add(new ForumUser(3,"Jen", 'F', LocalDate.of(1994,06,05), 3));
    }

    public List<ForumUser> getTheUserList(){
        return new ArrayList<>(theUserList);
    }

}
