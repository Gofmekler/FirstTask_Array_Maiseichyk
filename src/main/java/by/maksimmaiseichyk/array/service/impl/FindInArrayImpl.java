package by.maksimmaiseichyk.array.service.impl;

import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.service.FindInArrayService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FindInArrayImpl implements FindInArrayService {
    private static final Logger LOGGER = LogManager.getLogger();

    public int arrayMin(MainCustomArray customArray) {
        LOGGER.info("finding minimum element of array method called");
        int[] tempArray = customArray.getArray();
        int min = tempArray[0];
        for (int i = 1; i < tempArray.length; i++) {
            if (tempArray[i] < min) {
                min = tempArray[i];
            }
        }
        return min;
    }

    public int arrayMax(MainCustomArray customArray) {
        LOGGER.info("finding maximum element of array method called");
        int[] tempArray = customArray.getArray();
        int max = tempArray[0];
        for (int i = 1; i < tempArray.length; i++) {
            if (max < tempArray[i]) {
                max = tempArray[i];
            }
        }
        return max;
    }

    public int negativeInArray(MainCustomArray customArray) {
        LOGGER.info("counting negative elements in array method called");
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
        LOGGER.info("counting positive elements in array method called");
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
