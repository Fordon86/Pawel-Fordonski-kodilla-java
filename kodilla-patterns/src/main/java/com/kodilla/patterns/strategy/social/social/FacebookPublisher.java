package com.kodilla.patterns.strategy.social.social;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share () {
        return "[Facebook user] User use facebook";
    }

}
