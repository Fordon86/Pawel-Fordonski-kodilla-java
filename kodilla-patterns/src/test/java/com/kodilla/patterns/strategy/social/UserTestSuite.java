package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.social.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User zdzich = new Millenials("Zdzich");
        User jach = new YGeneration("Jach");
        User wladuch = new ZGeneration("Wladuch");

        //When
        String zdzichShouldPost = zdzich.defaultSharePost();
        System.out.println("Zdzich should used " + zdzichShouldPost);
        String jachShouldPost = jach.defaultSharePost();
        System.out.println("Jach should used " + jachShouldPost);
        String wladuchShouldPost = wladuch.defaultSharePost();
        System.out.println("Wladuch should used " + wladuchShouldPost);

        //Then
        Assert.assertEquals("[Facebook user] User use facebook", zdzichShouldPost);
        Assert.assertEquals("[Twitter user] User use Twitter", jachShouldPost);
        Assert.assertEquals("[Snapchat user] User use Snapchat", wladuchShouldPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User wladuch = new ZGeneration("Wladuch");

        //When
        String wladuchShouldPost = wladuch.defaultSharePost();
        System.out.println("Wladuch should used " + wladuchShouldPost);
        wladuch.setIndividualSharePost(new FacebookPublisher());
        wladuchShouldPost = wladuch.defaultSharePost();
        System.out.println("Wladuch should used " + wladuchShouldPost);

        //Then
        Assert.assertEquals("[Facebook user] User use facebook", wladuchShouldPost);
    }

}
