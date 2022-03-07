package by.maksimmaiseichyk.array.observer.impl;

import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.entity.MainCustomArrayParameters;
import by.maksimmaiseichyk.array.observer.ArrayEvent;
import by.maksimmaiseichyk.array.observer.ArrayObserver;
import by.maksimmaiseichyk.array.service.CalculateArrayService;
import by.maksimmaiseichyk.array.service.FindInArrayService;
import by.maksimmaiseichyk.array.service.impl.CalculateArrayImpl;
import by.maksimmaiseichyk.array.service.impl.FindInArrayImpl;
import by.maksimmaiseichyk.array.warehouse.Warehouse;

public class ArrayObserverImpl implements ArrayObserver {

    public void arrayParametersChanged(ArrayEvent event) {
        CalculateArrayService arrayCalculateService = new CalculateArrayImpl();
        FindInArrayService findInArrayService = new FindInArrayImpl();
        MainCustomArray array = event.getSource();

        int sum = arrayCalculateService.arraySum(array);
        double average = arrayCalculateService.arrayAverage(array);
        int min = findInArrayService.arrayMin(array);
        int max = findInArrayService.arrayMax(array);

        MainCustomArrayParameters parameters = new MainCustomArrayParameters(max, min, sum, average);

        parameters.setMax(max);
        parameters.setMin(min);
        parameters.setAverage(average);
        parameters.setSum(sum);

        int id = array.getId();
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.put(id, parameters);
    }
}
