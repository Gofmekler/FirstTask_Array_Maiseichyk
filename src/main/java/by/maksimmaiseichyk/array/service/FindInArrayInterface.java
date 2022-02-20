package main.java.by.maksimmaiseichyk.array.service;

import main.java.by.maksimmaiseichyk.array.entity.MainCustomArray;

public interface FindInArrayInterface {
    int arrayMin(MainCustomArray customArray);
    int arrayMax(MainCustomArray customArray);
    int negativeInArray(MainCustomArray customArray);
    int positiveInArray(MainCustomArray customArray);
}
