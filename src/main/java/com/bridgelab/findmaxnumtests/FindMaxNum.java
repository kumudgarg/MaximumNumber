package com.bridgelab.findmaxnumtests;

public class FindMaxNum {
    public static  <T extends Comparable<T>> T maximumValue(T firstVar, T secondVar, T thirdVar) {
        T maxValue = firstVar;
        if (secondVar.compareTo(maxValue) > 0)
            maxValue = secondVar;
        if (thirdVar.compareTo(maxValue) > 0)
            maxValue = thirdVar;
        return maxValue;
    }

}
