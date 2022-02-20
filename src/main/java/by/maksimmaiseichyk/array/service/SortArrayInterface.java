package main.java.by.maksimmaiseichyk.array.service;

import main.java.by.maksimmaiseichyk.array.entity.MainCustomArray;

public interface SortArrayInterface {
    void bubbleSort(MainCustomArray customArray);
    void quickSort(MainCustomArray customArray);
    void selectionSort(MainCustomArray customArray);
}
