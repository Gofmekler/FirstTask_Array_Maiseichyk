package by.maksimmaiseichyk.array.warehouse;

import by.maksimmaiseichyk.array.entity.MainCustomArrayParameters;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private static Warehouse instance;
    private Map<Integer, MainCustomArrayParameters> arrays;

    private Warehouse() {
        arrays = new HashMap<>();
    }

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }

    public MainCustomArrayParameters get(int id) {
        return arrays.get(id);
    }

    public MainCustomArrayParameters put(int id, MainCustomArrayParameters value) {
        return arrays.put(id, value);
    }

    public boolean remove(int id, MainCustomArrayParameters value) {
        return arrays.remove(id, value);
    }
}