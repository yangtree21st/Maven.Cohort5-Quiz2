package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if(array.length%2==0){
        return true ;}
        else{
            return false;
        }
    }

    public Integer[] range(int start, int stop) {

        Integer[] result = new Integer[stop-start];

        for(int i=0;i<stop-start;i++){
            result[i] = start+i;}

        return result;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        int sum = array[0] + array[1];
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int product = array[0] * array[1];
        return product;
    }
}
