package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] array3= new Integer[array1.length+array2.length];
        System.arraycopy(array1,0,array3,0,array1.length);
        System.arraycopy(array2,0,array3,array1.length, array2.length);
        return array3;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] rotateToBack = new Integer[index];
        Integer[] rotateToFront = new Integer[array.length - index];
        int i = 0;
        while (i < array.length){
            if (i < index) {
                rotateToBack[i] = array[i];
            }
            else {
                rotateToFront[(i - index)] = array[i];
            }
            i++;
        }
        Integer[] retArray = merge(rotateToFront, rotateToBack);
        return retArray;

    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = 0;
        Integer[] array = merge(array1, array2);
        for (Integer integer : array){
            if (integer.equals(valueToEvaluate)){
                count++;}
        }
        return count;
    }

    public Integer countOccurrence (Integer[] array1, Integer valueToEvaluate){
        Integer count = 0;
        for (Integer integer : array1){
            if (integer.equals(valueToEvaluate)){
                count++;}
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {


        Integer mostCommon = array[0];
        Integer mostCommonCount = 0;
        for (Integer integer : array) {
            int occurrences = countOccurrence(array,mostCommon);

            if (occurrences > mostCommonCount) {
                mostCommon = integer;
                mostCommonCount = occurrences;
            }
        }
        return mostCommon;
    }
    }

