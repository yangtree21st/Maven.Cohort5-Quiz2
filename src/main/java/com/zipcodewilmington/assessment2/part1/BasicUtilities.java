package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        if(value >= 5){
        return true;
    }
        else {
            return false;
        }
    }

    public Boolean isLessThan7(Integer value) {
        return value < 7;


    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        return valueToEvaluate >= 5&&  valueToEvaluate <= 7;

    }

    public Boolean startsWith(String string, Character character) {
        if(string.indexOf(0) == character){
            return true;
        }
        else {
            return false;
        }
    }
}
