package main.java.by.maksimmaiseichyk.array.service.impl;

import main.java.by.maksimmaiseichyk.array.service.FindInArrayInterface;
import main.java.by.maksimmaiseichyk.array.entity.MainCustomArray;


public class FindInArrayService implements FindInArrayInterface {

    public int arrayMin(MainCustomArray customArray) {
        int[] tempArray = customArray.getArray();
        int min = tempArray[0];
        for (int i = 1; i < tempArray.length; i++){
            if (tempArray[i] < min){
                min = tempArray[i];
            }
        }
        return min;
    }

    public int arrayMax(MainCustomArray customArray) {
        int[] tempArray = customArray.getArray();
        int max = tempArray[0];
        for (int i = 1; i < tempArray.length; i++){
            if (tempArray[i] > max){
                max = tempArray[i];
            }
        }
        return max;
    }

    public int negativeInArray(MainCustomArray customArray) {
        int[] tempArray = customArray.getArray();
        int count = 0;
        for (int j : tempArray) {
            if (j < 0) {
                count++;
            }
        }
    return count;
    }

    public int positiveInArray(MainCustomArray customArray) {
        int[] tempArray = customArray.getArray();
        int count = 0;
        for (int j : tempArray) {
            if (j > 0) {
                count++;
            }
        }
        return count;
    }
}
