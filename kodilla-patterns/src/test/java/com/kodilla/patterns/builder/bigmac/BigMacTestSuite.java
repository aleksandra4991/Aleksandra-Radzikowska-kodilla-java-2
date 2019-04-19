package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testNewBigMac() {
        //Given
        BigMac bigMac= new BigMac.BigMacBuilder()
                .bun("ordinary")
                .burger("Three")
                .sauce("spicy")
                .ingredients("onion")
                .ingredients("tomatoe")
                .ingredients("ooooo")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyIngredients);
    }
}
