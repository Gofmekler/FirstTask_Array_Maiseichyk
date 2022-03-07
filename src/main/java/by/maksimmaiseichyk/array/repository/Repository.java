package by.maksimmaiseichyk.array.repository;

import by.maksimmaiseichyk.array.entity.MainCustomArray;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public interface Repository {
    boolean add(MainCustomArray MainCustomArray);

    boolean addAll(Collection<MainCustomArray> collection);

    boolean remove(MainCustomArray MainCustomArray);

    boolean removeAll(Collection<MainCustomArray> collection);

    MainCustomArray get(int index);

    MainCustomArray set(int index, MainCustomArray MainCustomArray);

    List<MainCustomArray> getAll();

    List<MainCustomArray> query(Specifications specification);

    List<MainCustomArray> sort(Comparator<MainCustomArray> comparator);
}
