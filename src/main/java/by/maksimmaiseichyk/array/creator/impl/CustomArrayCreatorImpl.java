package by.maksimmaiseichyk.array.creator.impl;

import by.maksimmaiseichyk.array.creator.CustomArrayCreator;
import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.exceptions.MainCustomArrayException;

public class CustomArrayCreatorImpl implements CustomArrayCreator {

    @Override
    public MainCustomArray createCustomArray(int[] parsedAndValidatedArray){
        MainCustomArray customArray = new MainCustomArray();
        customArray.setArray(parsedAndValidatedArray);
        return customArray;
    }
}
