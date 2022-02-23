package by.maksimmaiseichyk.array.service;

import by.maksimmaiseichyk.array.entity.MainCustomArray;

public interface ChangeArrayService {
    void changeElements(MainCustomArray customArray, String term, int whatToChange, int changeTo);
}
