package by.maksimmaiseichyk.array.service;

import by.maksimmaiseichyk.array.entity.MainCustomArray;

public interface SortArrayService {
    void bubbleSort(MainCustomArray customArray);

    void quickSort(MainCustomArray customArray);

    void selectionSort(MainCustomArray customArray);
}
