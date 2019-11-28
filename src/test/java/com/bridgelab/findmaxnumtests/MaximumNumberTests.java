package com.bridgelab.findmaxnumtests;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTests {

    @Test
    public void givenIntegers_ShouldGiveMaximumInteger() {
        FindMaxNum findMaxNum = new FindMaxNum();
        Integer maxNum = findMaxNum.maxInteger(23, 56, 11);
        Assert.assertEquals((Integer) 56, maxNum);
        Integer maxNum1 = findMaxNum.maxInteger(56, 23, 11);
        Assert.assertEquals((Integer) 56, maxNum1);
        Integer maxNum2 = findMaxNum.maxInteger(23, 11, 56);
        Assert.assertEquals((Integer) 56, maxNum2);
    }

    @Test
    public void givenFloats_ShouldGiveMaximumFloat() {
        FindMaxNum findMaxNum = new FindMaxNum();
        Float maxNum = findMaxNum.maxFloat(12.66f, 56.26f, 11.88f);
        Assert.assertEquals((Float) 56.26f, maxNum);
        Float maxNum1 = findMaxNum.maxFloat(56.26f, 12.66f, 11.88f);
        Assert.assertEquals((Float) 56.26f, maxNum1);
        Float maxNum2 = findMaxNum.maxFloat(12.66f, 11.88f, 56.26f);
        Assert.assertEquals((Float) 56.26f, maxNum2);
    }
}
