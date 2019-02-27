package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    private List<Integer> myList = new ArrayList<>();

    public Boolean add(int i) {
        return myList.add(i);
    }

    public Integer size() {
        return myList.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> UnList = new ArrayList<>();
        for (Integer integer : myList) {
            if (!UnList.contains(integer)) {
                UnList.add(integer);
            }
        }
        return UnList;
    }

    public String join() {
        String returnString = "" + myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            returnString += ", " + myList.get(i);
        }
        return returnString;

    }

    public Integer mostCommon() {

        Integer[] array = new Integer[myList.size()];
        ArrayUtility arrayUtility = new ArrayUtility();
        return arrayUtility.mostCommon(myList.toArray(array));
    }

    public Boolean contains(Integer valueToAdd) {
        return myList.contains(valueToAdd);
    }

}
