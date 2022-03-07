package by.maksimmaiseichyk.array.repository.impl;

import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.repository.Repository;
import by.maksimmaiseichyk.array.repository.Specifications;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RepositoryImpl implements Repository {
    private static RepositoryImpl instance;
    private List<MainCustomArray> customArrays;

    private RepositoryImpl() {
        customArrays = new ArrayList<>();
    }

    public static RepositoryImpl getInstance() {
        if (instance == null) {
            instance = new RepositoryImpl();
        }
        return instance;
    }

    public RepositoryImpl(List<MainCustomArray> customArrays) {
        this.customArrays = customArrays;
    }

    public boolean add(MainCustomArray customArray) {
        return customArrays.add(customArray);
    }

    public boolean addAll(Collection<MainCustomArray> collection) {
        return customArrays.addAll(collection);
    }

    public boolean remove(MainCustomArray customArray) {
        return customArrays.remove(customArray);
    }

    public boolean removeAll(Collection<MainCustomArray> collection) {
        return customArrays.removeAll(collection);
    }

    public MainCustomArray get(int index) {
        return customArrays.get(index);
    }

    public MainCustomArray set(int index, MainCustomArray customArray) {
        return customArrays.set(index, customArray);
    }

    public List<MainCustomArray> getAll() {
        return customArrays;
    }

    public List<MainCustomArray> query(Specifications specification) {
        return customArrays.stream().filter(specification::specify).collect(Collectors.toList());
    }

    public List<MainCustomArray> sort(Comparator<MainCustomArray> comparator) {
        return customArrays.stream().sorted(comparator).collect(Collectors.toList());
    }
}
