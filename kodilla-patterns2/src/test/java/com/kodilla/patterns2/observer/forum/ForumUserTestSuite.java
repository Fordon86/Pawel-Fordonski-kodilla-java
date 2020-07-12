package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiPinkman = new ForumUser("Jessi Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiPinkman);
        javaToolsForum.registerObserver(jessiPinkman);
        //When
        javaHelpForum.addPost("Hi everyone!");
        javaHelpForum.addPost("Better try");
        javaToolsForum.addPost("Help pls");
        javaHelpForum.addPost("Why while?");
        javaToolsForum.addPost("When I try");
        //Given
        assertEquals(3,johnSmith.getUpdateCount());
        assertEquals(2,ivoneEscobar.getUpdateCount());
        assertEquals(5,jessiPinkman.getUpdateCount());
    }
}
