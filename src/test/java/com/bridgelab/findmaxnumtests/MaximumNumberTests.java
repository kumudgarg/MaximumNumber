package com.bridgelab.findmaxnumtests;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTests {

    @Test
    public void givenSpecificDataTypeValue_ShouldReturnMaximumValue() {
        FindMaxNum findMaxNum = new FindMaxNum();
        Integer maxInt = findMaxNum.maximumValue(23, 56, 11);
        Assert.assertEquals( 56, maxInt.intValue());
        Float maxFloat = findMaxNum.maximumValue(12.66f, 56.26f, 11.88f);
        Assert.assertEquals( (Float) 56.26f, maxFloat);
        Character maxChar = findMaxNum.maximumValue('w', 'p', 's');
        Assert.assertEquals('w', maxChar.charValue());
    }
}
