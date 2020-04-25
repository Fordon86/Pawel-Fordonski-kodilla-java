package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.bigmac.bun.Bun;
import com.kodilla.patterns.bigmac.sauce.Souce;
import org.junit.Assert;
import com.kodilla.patterns.bigmac.Bigmac;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacOrder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredients("mushrooms")
                .ingredients("onion")
                .bun(new Bun("SESAME"))
                .burgers(3)
                .sauce(new Souce("BARBECUE"))
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Given
        Assert.assertEquals(2, howManyIngredients);
    }

}
