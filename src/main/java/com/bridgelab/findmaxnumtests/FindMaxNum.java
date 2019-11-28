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
}
