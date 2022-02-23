package by.maksimmaiseichyk.array.service;

import by.maksimmaiseichyk.array.entity.MainCustomArray;

public interface FindInArrayService {
    int arrayMin(MainCustomArray customArray);

    int arrayMax(MainCustomArray customArray);

    int negativeInArray(MainCustomArray customArray);

    int positiveInArray(MainCustomArray customArray);
}
