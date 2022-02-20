package main.java.by.maksimmaiseichyk.array.service.impl;

import main.java.by.maksimmaiseichyk.array.entity.MainCustomArray;
import main.java.by.maksimmaiseichyk.array.service.SortArrayInterface;

public class SortArrayService implements SortArrayInterface {

    public void bubbleSort(MainCustomArray customArray) {
        int[] tempArray = customArray.getArray();
        if (tempArray.length <= 1){
            return;
    }
        int temp;
            for (int i = 0; i < tempArray.length - 1; i++) {
                for (int j = tempArray.length - 1; j >= i; j--) {
                    if (tempArray[i] < tempArray[i + 1]) {
                        temp = tempArray[i];
                        tempArray[i] = tempArray[i + 1];
                        tempArray[i + 1] = temp;
                }
            }
        }
        customArray.setArray(tempArray);
    }

    public void quickSort(MainCustomArray customArray) {
        int[] tempArray = customArray.getArray();
        quickSortLogic(tempArray, 0, tempArray.length - 1);
        customArray.setArray(tempArray);
    }
    private void quickSortLogic(int[] array, int low, int high){
        if (array.length <= 1){
            return;
        }
        int lowBorder = low;
        int highBorder = high;
        int middleOfArray = array.length / 2;
        int middleElementOfArray = array[middleOfArray];
        while(lowBorder <= highBorder) {
            while (array[lowBorder] < middleElementOfArray) {
                lowBorder++;
            }
            while (array[highBorder] > middleElementOfArray){
                highBorder--;
            }
            if (lowBorder <= highBorder){
                if (lowBorder < highBorder) {
                    int temp = array[lowBorder];
                    array[lowBorder] = array[highBorder];
                    array[highBorder] = temp;
                }
                lowBorder++;
                highBorder--;
            }
        }
        if (low < highBorder){
            quickSortLogic(array,low, highBorder);
        }
        if (high > lowBorder){
            quickSortLogic(array, lowBorder, high);
        }
    }

    public void selectionSort(MainCustomArray customArray) {
        int[] tempArray = customArray.getArray();
        if (tempArray.length <= 1){
            return;
        }
        for (int i = 0; i < tempArray.length; i++) {

            int min = i;
            for (int j = i + 1; j < tempArray.length; j++) {
                if (tempArray[j] < tempArray[min]) {
                    min = j;
                }
            }

            int temp = tempArray[i];
            tempArray[i] = tempArray[min];
            tempArray[min] = temp;
        }
        customArray.setArray(tempArray);
    }
}
