package by.maksimmaiseichyk.array.service.impl;


import by.maksimmaiseichyk.array.entity.MainCustomArray;

public class CalculateArrayImpl implements by.maksimmaiseichyk.array.service.CalculateArrayService {

    @Override
    public int arraySum(MainCustomArray customArray) {
        int[] tempArray = customArray.getArray();
        int sum = 0;
        for (int i = 0; i <= tempArray.length; i++) {
            sum += tempArray[i];
        }
        return sum;
    }

    @Override
    public double arrayAverage(MainCustomArray customArray) {
        int[] tempArray = customArray.getArray();
        int sum = 0;
        for (int i = 0; i <= tempArray.length; i++) {
            sum += tempArray[i];
        }
        return sum / tempArray.length;
    }
}
