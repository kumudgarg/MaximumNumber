package com.bridgelab.findmaxnumtests;

public class FindMaxNum {
    public Integer maxInteger(Integer firstNum, Integer secondNum, Integer thirdNum) {
        Integer max = firstNum;
        if (secondNum.compareTo(max) > 0)
            max = secondNum;
        if (thirdNum.compareTo(max) > 0)
            max = thirdNum;
        return max;
    }

    public Float maxFloat(Float firstNum, Float secondNum, Float thirdNum) {
        Float max = firstNum;
        if (secondNum.compareTo(max) > 0)
            max = secondNum;
        if (thirdNum.compareTo(max) > 0)
            max = thirdNum;
        return max;
    }

    public Character maxChars(Character firstChar, Character secondChar, Character thirdChar) {
        Character max = firstChar;
        if (secondChar.compareTo(max) > 0)
            max = secondChar;
        if (thirdChar.compareTo(max) > 0)
            max = thirdChar;
        return max;
    }
}
