package by.maksimmaiseichyk.array.service.impl;

import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.service.CalculateArrayService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculateArrayImpl implements CalculateArrayService {
    private static final Logger LOGGER = LogManager.getLogger();

    public int arraySum(MainCustomArray customArray) {
        LOGGER.info("counting sum of elements in array method is called");
        int[] tempArray = customArray.getArray();
        int sum = 0;
        for (int i = 0; i <= tempArray.length - 1; i++) {
            sum += tempArray[i];
        }
        return sum;
    }

    public double arrayAverage(MainCustomArray customArray) {
        LOGGER.info("counting an average in array method is called");
        int[] tempArray = customArray.getArray();
        int sum = 0;
        for (int i = 0; i <= tempArray.length - 1; i++) {
            sum += tempArray[i];
        }
        return sum / tempArray.length;
    }
}
