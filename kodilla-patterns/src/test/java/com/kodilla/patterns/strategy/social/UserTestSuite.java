package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User alex = new Millenials("Alex");
        User yuan = new YGeneration("Yuan");
        User cris = new ZGeneration("Cris");

        //When
        String alexPublishingPost = alex.sharePost();
        System.out.println("Alex published post on:  " + alexPublishingPost);
        String yuanPublishingPost = yuan.sharePost();
        System.out.println("Yuan published post on: " + yuanPublishingPost);
        String crisPublishingPost = cris.sharePost();
        System.out.println("Cris published post on:  " + crisPublishingPost);

        //Then
        Assert.assertEquals("[FacebookPublisher] ", alexPublishingPost);
        Assert.assertEquals("[TwitterPublisher] ", yuanPublishingPost);
        Assert.assertEquals("[SnapchatPublisher] ", crisPublishingPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User alex = new Millenials("Alex");

        //When
        String alexPublishingPost = alex.sharePost();
        System.out.println("Alex published post on:  " + alexPublishingPost);
        alex.setSocialPublisher(new TwitterPublisher());
        alexPublishingPost = alex.sharePost();
        System.out.println("Alex published post on:  " + alexPublishingPost);
        //Then
        Assert.assertEquals("[TwitterPublisher] ", alexPublishingPost);
    }
}

