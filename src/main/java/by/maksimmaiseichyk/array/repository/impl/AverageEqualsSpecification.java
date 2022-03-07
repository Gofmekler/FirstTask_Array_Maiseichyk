package by.maksimmaiseichyk.array.repository.impl;

import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.repository.Specifications;
import by.maksimmaiseichyk.array.service.CalculateArrayService;
import by.maksimmaiseichyk.array.service.impl.CalculateArrayImpl;

public class AverageEqualsSpecification implements Specifications {
    private final int value;

    public AverageEqualsSpecification(int value) {
        this.value = value;
    }

    public boolean specify(MainCustomArray customArray) {
        CalculateArrayService calculateService = new CalculateArrayImpl();
        double ArrayAverage = calculateService.arrayAverage(customArray);
        return (ArrayAverage == value);
    }
}
