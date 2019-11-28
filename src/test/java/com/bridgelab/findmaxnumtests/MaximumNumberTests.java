package com.bridgelab.findmaxnumtests;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTests {

    @Test
    public void givenSpecificDataTypeValue_ShouldReturnMaximumValue() {
        FindMaxNum findMaxNum = new FindMaxNum(23,56,11);
        Integer maxInt = (Integer) findMaxNum.maximumValue();
        Assert.assertEquals( 56, maxInt.intValue());
        FindMaxNum findMaxFloat = new FindMaxNum(23.32f,89.26f,88.48f);
        Float maxFloat = (Float) findMaxFloat.maximumValue();
        Assert.assertEquals((Float) 89.26f, maxFloat);
        FindMaxNum findMaxChar = new FindMaxNum('w','p','b');
        Character maxChar = (Character) findMaxChar.maximumValue();
        Assert.assertEquals( (Character)'w', maxChar);
    }
}
