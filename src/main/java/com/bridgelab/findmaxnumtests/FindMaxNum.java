package com.bridgelab.findmaxnumtests;

public class  FindMaxNum<T extends Comparable<T>> {

        T firstVar;
        T secondVar;
        T thirdVar;

    public FindMaxNum(T firstVar, T secondVar, T thirdVar) {
        this.firstVar = firstVar;
        this.secondVar = secondVar;
        this.thirdVar = thirdVar;
    }

    public <T extends Comparable<T>> T maximumValue(){
       return (T) maximumValue(firstVar,secondVar,thirdVar);
    }

    public static  <T extends Comparable<T>> T maximumValue(T firstVar, T secondVar, T thirdVar) {
        T maxValue = firstVar;
        if (secondVar.compareTo(maxValue) > 0)
            maxValue = secondVar;
        if (thirdVar.compareTo(maxValue) > 0)
            maxValue = thirdVar;
        printMax(maxValue);
        return maxValue;
    }

    private static <T extends Comparable<T>> void printMax(T maxValue) {
        System.out.println("maximum value is : " + maxValue);
    }

}
