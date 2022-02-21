package main.java.by.maksimmaiseichyk.array.service.impl;


import main.java.by.maksimmaiseichyk.array.service.CalculateArrayInterface;
import main.java.by.maksimmaiseichyk.array.entity.MainCustomArray;

public class CalculateArrayService implements CalculateArrayInterface {

    @Override
    public int arraySum(MainCustomArray customArray) {
        int[] tempArray = customArray.getArray();
        int sum = 0;
        for (int i = 0; i <= tempArray.length; i++){
            sum += tempArray[i];
        }
        return sum;
    }

    @Override
    public int arrayAverage(MainCustomArray customArray) {
        int[] tempArray = customArray.getArray();
        int sum = 0;
        for (int i = 0; i <= tempArray.length; i++){
            sum += tempArray[i];
        }
        return sum / tempArray.length;
    }
}
