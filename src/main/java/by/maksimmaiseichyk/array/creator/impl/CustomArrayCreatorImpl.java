package by.maksimmaiseichyk.array.creator.impl;

import by.maksimmaiseichyk.array.creator.CustomArrayCreator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;

public class CustomArrayCreatorImpl implements CustomArrayCreator  {
    private static final Logger LOGGER = LogManager.getLogger();

    public ArrayList<int[]> createCustomArray(ArrayList<int[]> parsedAndValidatedArray){
        LOGGER.info("create new CustomArray method called");
        ArrayList<int[]> customArrays = new ArrayList<>();
        if (parsedAndValidatedArray == null) {
            return customArrays;
        }
        customArrays.addAll(parsedAndValidatedArray);
        return customArrays;
    }
}
