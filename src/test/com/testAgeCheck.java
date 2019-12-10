package com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testAgeCheck {
    @Test
    public void testAgeCheck() {
        //given
        //when
        //then

        Assert.assertEquals(AgeCheck.getAgeName(6),  "儿童");
        Assert.assertEquals(AgeCheck.getAgeName(7),  "少年");
        Assert.assertEquals(AgeCheck.getAgeName(20), "青年");


    }

    @Test
    public void testAgeCheck2() {
        //given
        //when
        //then


        Assert.assertEquals(AgeCheck.getAgeName(45), "中年");
        Assert.assertEquals(AgeCheck.getAgeName(60), "老年");
        Assert.assertEquals(AgeCheck.getAgeName(80), "老年");

    }
}
