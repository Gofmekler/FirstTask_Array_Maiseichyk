package by.maksimmaiseichyk.array.repository.impl;

import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.repository.Repository;
import by.maksimmaiseichyk.array.repository.Specifications;

import java.util.Collection;
import java.util.List;

public class RepositoryImpl implements Repository {
    private List<MainCustomArray> customArray;
    @Override
    public void addObjectToRepository(MainCustomArray someArray) {
        customArray.add(someArray);
    }

    @Override
    public void removeObjectFromRepository(MainCustomArray someArray) {
        customArray.remove(someArray);
    }

    @Override
    public void addAll(Collection<MainCustomArray> someArray) {
        customArray.addAll(someArray);
    }

    @Override
    public void removeAll(Collection<MainCustomArray> someArray) {
        customArray.removeAll(someArray);
    }

    @Override
    public List<MainCustomArray> query(Specifications specification) {
        return null;
    }
}
