package by.maksimmaiseichyk.array.service.impl;

import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.service.ChangeArrayService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChangeArrayImpl implements ChangeArrayService {
    private static final Logger LOGGER = LogManager.getLogger();

    public void changeElements(MainCustomArray customArray, String term, int whatToChange, int changeTo) {
        LOGGER.info("the method of replacing an element by an array is called");
        int[] tempArray = customArray.getArray();
        switch (term) {
            case ("<"):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] < whatToChange) {
                        tempArray[i] = changeTo;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case (">"):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] > whatToChange) {
                        tempArray[i] = changeTo;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case ("="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] == whatToChange) {
                        tempArray[i] = changeTo;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case ("!="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] != whatToChange) {
                        tempArray[i] = changeTo;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case (">="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] >= whatToChange) {
                        tempArray[i] = changeTo;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case ("<="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] <= whatToChange) {
                        tempArray[i] = changeTo;
                    }
                }
                customArray.setArray(tempArray);
                break;
        }
    }
}
