package by.maksimmaiseichyk.array.creator.impl;

import by.maksimmaiseichyk.array.creator.WarehouseCreator;
import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.entity.MainCustomArrayParameters;
import by.maksimmaiseichyk.array.service.CalculateArrayService;
import by.maksimmaiseichyk.array.service.FindInArrayService;
import by.maksimmaiseichyk.array.service.impl.CalculateArrayImpl;
import by.maksimmaiseichyk.array.service.impl.FindInArrayImpl;
import by.maksimmaiseichyk.array.warehouse.Warehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class WarehouseCreatorImpl implements WarehouseCreator {
    private static final Logger LOGGER = LogManager.getLogger();

    public Warehouse createWarehouse(ArrayList<MainCustomArray> customArrays) {
        LOGGER.info("create new Warehouse method called");
        Warehouse warehouse = Warehouse.getInstance();
        CalculateArrayService arrayCalculateService = new CalculateArrayImpl();
        FindInArrayService findInArrayService = new FindInArrayImpl();
        for(MainCustomArray array : customArrays) {
            int sum = arrayCalculateService.arraySum(array);
            double average = arrayCalculateService.arrayAverage(array);
            int min = findInArrayService.arrayMin(array);
            int max = findInArrayService.arrayMax(array);

            MainCustomArrayParameters parameters = new MainCustomArrayParameters(max, min, sum, average);
            int id = array.getId();
            warehouse.put(id, parameters);
        }
        return warehouse;
    }
}
