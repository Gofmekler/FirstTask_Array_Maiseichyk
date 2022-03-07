package by.maksimmaiseichyk.array.repository.impl;

import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.repository.Specifications;
import by.maksimmaiseichyk.array.service.FindInArrayService;
import by.maksimmaiseichyk.array.service.impl.FindInArrayImpl;

public class MaxLessSpecification implements Specifications {
    private final int value;

    public MaxLessSpecification(int value) {
        this.value = value;
    }

    public boolean specify(MainCustomArray customArray) {
        FindInArrayService findService = new FindInArrayImpl();
        int maxElement = findService.arrayMax(customArray);
        return (maxElement < value);
    }
}
