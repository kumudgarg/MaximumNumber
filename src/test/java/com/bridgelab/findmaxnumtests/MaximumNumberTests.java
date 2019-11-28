package com.bridgelab.findmaxnumtests;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTests {

    @Test
    public void givenIntegers_ShouldGiveMaximum() {
        FindMaxNum findMaxNum = new FindMaxNum();
        Integer maxNum = findMaxNum.maxInteger(23, 56, 11);
        Assert.assertEquals((Integer) 56, maxNum);
        Integer maxNum1 = findMaxNum.maxInteger(56, 23, 11);
        Assert.assertEquals((Integer) 56, maxNum1);
        Integer maxNum2 = findMaxNum.maxInteger(23, 11, 56);
        Assert.assertEquals((Integer) 56, maxNum2);
    }
}
