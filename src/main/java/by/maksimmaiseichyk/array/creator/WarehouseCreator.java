package by.maksimmaiseichyk.array.creator;

import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.repository.Repository;
import by.maksimmaiseichyk.array.warehouse.Warehouse;

import java.util.ArrayList;

public interface WarehouseCreator {
    Warehouse createWarehouse(ArrayList<MainCustomArray> customArrays);
}
